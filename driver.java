
public class driver 
{
	public static void main(String[] args) 
	{
		Parser p = new Parser("   a =    (a*  b) - c;");
		Parser p2 = new Parser("    a = b - c;");
		
		p.parse();
	}

}
