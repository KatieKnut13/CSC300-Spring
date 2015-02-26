
public class item 
{
	private int value;
	private item nextitem;
	
	public item(int value)
	{
		this.value = value;
		this.nextitem = null;
	}
	
	public void setNextItem(item nextitem)
	{
		this.nextitem = nextitem;
	}
	
	public item getNextItem()
	{
		return this.nextitem;
	}
	
	public int getValue()
	{
		return this.value;
	}
}
