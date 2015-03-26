
public class BinaryTree 
{
	private Node2 root;
	
	public BinaryTree()
	{
		this.root = null;
	}

	public void displayInOrder()
	{
		//System.out.println("**** In Order ****");
		if(this.root == null)
		{
			//System.out.println("Empty Tree");
		}
		else
		{
			displayInOrder(Node2.getLeft());
			System.out.println(Node2.addNode());
			displayInOrder(Node2.getRight());
		}
	}

	public void displayPostOrder()
	{
		//System.out.println("**** Post Order ****");
		if(this.root == null)
		{
			//System.out.println("Empty Tree");
		}
		else
		{
			displayInOrder(Node2.getLeft());
			displayInOrder(Node2.getRight());
			System.out.println(Node2.addNode());
		}
	}

	public void add(int value)
	{
		Node2 theNode = new Node2(value);
		if(this.root == null)
		{
			this.root = theNode;
		}
		else
		{
			this.root.addNode2(theNode);
		}
	}
}
