import java.util.Scanner;
class A2_13
{
	public static void main(String args[])
	{
		double area;
		float peri;
		Scanner Sc = new Scanner(System.in);
		System.out.println(" enter the width of rect:");
		System.out.println(" enter the height of rect 2:");
		double w = Sc.nextDouble();
		double h = Sc.nextDouble();
		area = (w*h);
		peri = 2*(w+h);
		System.out.println("Area is 5.6*8.5 =" +area);
		System.out.println("Perimeter is 2*(5.6+8.5) =" +peri);
    }
	
}