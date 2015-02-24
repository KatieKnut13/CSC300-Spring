
public class node 
{
	private node nextnode;
	private node prevNode;
	private int payload;
	
	
	public node(int payload)
	{
		this.payload = payload;
		this.nextnode = null;
		this.prevNode = null;
	}
	
	public node getPrevNode()
	{
		return this.prevNode;
	}
	
	public void setPrevNode(node input)
	{
		this.prevNode = input;
	}
	
	public node getNextnode()
	{
		return this.nextnode;
	}
	
	public void setNextNode(node Nextnode)
	{
		this.nextnode = nextnode;
	}
	
	public int getpayload()
	{
		return payload;
	}
}
