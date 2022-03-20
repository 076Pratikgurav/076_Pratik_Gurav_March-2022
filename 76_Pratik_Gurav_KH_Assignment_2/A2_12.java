import java.util.Scanner;
class A2_12
{
	public static void main(String args[])
	{
		double Avg;
		Scanner Sc = new Scanner(System.in);
		System.out.println(" enter the first number n1:");
		System.out.println(" enter the Second number n2:");
		System.out.println(" enter the third number n3:");
		double n1 = Sc.nextDouble();
		double n2 = Sc.nextDouble();
		double n3 = Sc.nextDouble();
		Avg = (n1+n2+n3)/3;
		System.out.println(" the average =" +Avg);
		
    }
	
}