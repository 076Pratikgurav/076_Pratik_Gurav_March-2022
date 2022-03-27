class Operation
	{
	}
 public class Ass_4
{ 	
	static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	static void sub(int a,int b)
	{
		System.out.println(a-b);
	}
	static void multi(int a,int b)
	{
		System.out.println(a*b);
	}
	static void div(int a,int b)
	{
		System.out.println(a/b);
	}
	public static void main(String args[])
	{
		add(10,20);
		sub(50,10);
		multi(50,10);
		div(1000,100);
		
		int a= 10,b =20;
		if(a==b)
		{
			System.out.println("same");
		}
		else {
			System.out.println("not same");
		}
		 if(a>b)
		{
			System.out.println("a is grater than b");
		}
		else if (a % 5 ==0)			
		{
			System.out.println(" a is divisable by 5");
		}
		 if(a<b)
		{
			System.out.println("a is smaller than b");
		}
		else
		{
			System.out.println("a is not smaller than b");
		}
			
	}
} 