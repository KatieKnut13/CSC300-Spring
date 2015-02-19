
public class LinkList 
{
	private node head;
	private int count;
	//upgrade our LinkList so that there is a pointer called tail
	//that points to the end of the list, and each node, knows about the
	//previousNode. So you need to update all the add methods, all the
	//remove methods, and finally re-write displayInReverse to take advantage
	//of our new double-link list.
	public LinkList()
	{
		this.head = null;
		this.count = 0;
	}
	
	public void display()
	{
		if(head == null)
		{
			System.out.println("Empty List");
		}
		else
		{
			node currnode = this.head;
			while(currnode.getNextnode() != null)
			{
				System.out.println(currnode.getpayload() + "->");
				currnode = currnode.getNextnode();
			}
			System.out.println(currnode.getpayload() + "-> null");
		}
	}
	
	public void displayInRevers()
	{
		for(int i = this.count-1; i >= 0; i--)
		{
			System.out.println(this.get(i));
			System.out.print(" -> ");
		}
		System.out.println("null");
	}
	
	public int get(int index)
	{
		int count = this.count();
		if(index >= count || index < 0)
		{
			System.out.println("Illegal Index");
			return -1;
		}
		else
		{
			node curr = head;
			for(int i = 0; i < index; i++)
			{
				curr = curr.getNextnode();
			}
			return curr.getpayload();
		}
	}
	
	public int count()
	{
		return this.count;
	}
	
	public void addFront(int payload)
	{
		node n = new node(payload);
		if(head == null)
		{
			head = n;
		}
		else
		{
			n.setNextNode(head);
			head = n;
		}
		this.count++;
	}
	
	public void addAtIndex(int payload, int index)
	{
		
		if(index <= 0)
		{
			this.addFront(payload);
		}
		else if(index >= count)
		{
			this.addEnd(payload);
		}
		else
		{
			node n = new node(payload);
			node prevTarget = null;
			node fronTarget = this.head;
			for(int i = 0; i < index-1; i++)
			{
				prevTarget = fronTarget;
				fronTarget = fronTarget.getNextnode();
			}
			n.setNextNode(fronTarget);
			prevTarget.setNextNode(n);
			count++;
		}
	}
	
	public void addEnd(int payload)
	{
		node n = new node(payload);
		if(this.head == null)
		{
			this.head = n;
		}
		else
		{
			//find the last node in the list
			node currnode = this.head;
			while(currnode.getNextnode() != null)
			{
				currnode = currnode.getNextnode();
			}
			//currnode will point to the very last Node in the list
			currnode.setNextNode(n);
		}
		this.count++;
	}
	
	public int removeEnd() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Can Not Remove End: Empty List");
		}
		else if(this.count == 1)
		{
			return this.removeFront();
		}
		node curr = this.head;
		for(int i = 1; i < count -1; i++)
		{
			curr = curr.getNextnode();
		}
		int payload = curr.getNextnode().getpayload();
		count--;
		curr.setNextNode(null);
		return payload;
		
	}
	
	public int removeFront() throws Exception
	{
		if(head == null)
		{
			throw new Exception("Can Not Remove Front: Empty List");
		}
		node currnode = head;
		head = head.getNextnode();
		currnode.setNextNode(null);
		this.count--;
		return currnode.getpayload();
	}
	
	public int removeAtIndex(int index) throws Exception
	{
		if(head == null)
		{
			throw new Exception("Cannot Remove from Index: Empty List");
		}
		else if(this.count == 1)
		{
			return this.removeFront();
		}
		else if(index >= count)
		{
			throw new Exception("Cannot Remove from Index: Index too Large");
		}
		else if(index < 0)
		{
			throw new Exception("Cannot Remove from Index: Index must be greater than zero");
		}
		else
		{
			node targetLead = null;
			node target = this.head;
			for(int i = 0; i < index; i++)
			{
				targetLead = target;
				target = target.getNextnode();
			}
			int payload = target.getpayload();
			targetLead.setNextNode(target.getNextnode());
			target.setNextNode(null);
			this.count--;
			return payload;
		}
	}
}
