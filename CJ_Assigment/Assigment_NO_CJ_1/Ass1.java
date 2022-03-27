class abb
{
	static int p;
	static
	{
		p=5000;
	}
	int d =314;  
	 //static int d = 3.14;// lossy conversion
}





class Ass1
{
	 static int k = 5235;
	public static void main(String args[])
	
		{
			int a = 10; // Decimal
			int b = 067;// octal value
			int c = 0x15;// Hexa decimal
			int e = 0B1111;// Binaray value 
			// int d = 0.31 ;
	        //static int k = 500; we can not declare local variable as static
			int k = 500; 
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			abb b1 =new abb(); // object creation
		    System.out.println(b1.d);
			System.out.println(k);
			System.out.println(abb.p);
			 
		}
}