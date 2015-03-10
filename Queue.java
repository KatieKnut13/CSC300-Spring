
public class Queue 
{
	private Person front;
	private Person back;
	private int count;
	
	public Queue()
	{
		this.front = null;
		this.back = null;
		this.count = 0;
	}
	
	public void enqueue(String input)
	{
		if(this.front == null)
		{
			Person temp = new Person(input);
			this.front = temp;
			this.back = temp;
		}
		else
		{
			Person temp = new Person(input);
			this.back = temp;
		}
		this.count++;
	}
	
	public int dequeue()
	{
		int payloadToReturn = front.getWalletBalance();
		this.front = this.front.getNextPerson();
		return payloadToReturn;
	}
	
	public void displayFront()
	{
		Person temp = this.front;
		System.out.println("My name is" + front.getName(); " and I have $" + front.getWalletBalance());
	}
}
