
public class stack 
{
	private item topItem;
	
	public stack()
	{
		this.topItem = null;
	}
	
	public void addItem(int value)
	{
		item newTop = new item(value);
		if(this.topItem == null)
		{
			this.topItem = newTop;
		}
		else
		{
			item next = this.topItem;
			newTop.setNextItem(nextitem);
			this.topItem = newTop;
		}
	}
	
	public int removeTop() throws Exception
	{
		int removedValue;
		if(this.topItem == null)
		{
			throw new Exception("Can not remove item.");
		}
		else
		{
			item currTop = this.topItem;
			item newTop = currTop.getNextItem();
			removedValue = currTop.getValue();
			currTop.setNextItem(null);
			this.topItem = newTop;
		}
		return removedValue;
	}
	
	public int topValue()
	{
		return this.topItem.getValue();
	}
}
