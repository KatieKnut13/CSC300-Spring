import java.util.Random;

public class Person 
{
	private String name;
	private int walletBalance;
	private static Random r = new Random();
	private Person NextPerson;
	
	public Person(String name)
	{
		this.name = name;
		this.walletBalance = Person.r.nextInt(10);
		this.NextPerson = null;
	}
	
	public void display()
	{
		System.out.println("Hi, my name is: " + this.name + " and I have: $" + this.walletBalance + " on me!");
	}

	public String getName() 
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getWalletBalance() 
	{
		return walletBalance;
	}

	public void setWalletBalance(int walletBalance) 
	{
		this.walletBalance = walletBalance;
	}

	public static Random getR() 
	{
		return r;
	}

	public static void setR(Random r) 
	{
		Person.r = r;
	}
	
	public Person getNextPerson()
	{
		return NextPerson;
	}
}
