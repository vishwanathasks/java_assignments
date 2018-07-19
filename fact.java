public class fact
{
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return (n*fact(n-1));
	}
	

	public static void main(String args[])
	{
		int m=5;  
		 // We can use Scanner class to take the input from the user
		int fact=fact(m);
		System.out.println(" the factorial of number is"+" "+fact);
	}
}