
public class fraction extends Object
{
	int numerator;
	int denominator;
	
	
	public fraction(int numerator, int denominator)
	{
		this.numerator = numerator;
		this.denominator = denominator;
	}
	
	public void display()
	{
		System.out.println(this.numerator + "/" + this.denominator);
	}
}
