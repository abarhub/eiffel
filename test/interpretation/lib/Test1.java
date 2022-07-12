public class Test1
{
	private static final float precisionf=1000.0f;
	private static final double precisiond=1000.0;

	public static void print()
	{
		System.out.println("Coucou");
	}

	public static void print2(String s)
	{
		System.out.println("Coucou:"+s);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
	
	public static void prints(String s)
	{
		System.out.println(s);
	}

	public static void printi(int i)
	{
		System.out.println(i);
	}

	public static void printb(boolean b)
	{
		System.out.println(b);
	}

	public static void printr(float f)
	{
		System.out.println(Math.round(f*precisionf)/precisionf);
	}
	
	public static void printd(double d)
	{
		System.out.println(Math.round(d*precisiond)/precisiond);
	}

	public static void printc(char c)
	{
		System.out.println(c);
	}
}
