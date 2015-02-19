
public class node 
{
	private node nextnode;
	private int payload;
	
	public node(int payload)
	{
		this.payload = payload;
		this.nextnode = null;
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
