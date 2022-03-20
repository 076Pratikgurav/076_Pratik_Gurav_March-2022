import java.util.Scanner;
class A2_11
{
	public static void main(String args[])
	{
	double Area;
	final double pi =22.0/7;
	
	Scanner Sc = new Scanner(System.in);
	System.out.println(" enter the radius");
	double r = Sc.nextDouble();
	Area = (pi* r*r);
	double peri = (2*pi*r);
	System.out.println(" the area =" +Area);
	System.out.println(" the Perimeter =" +peri);
}
	
}
	
