import java.util.Scanner;
class A2_6
{
  public static void main(String args[])
  {
	Scanner Sc=new Scanner(System.in);
	System.out.println(" Enter the n1:");
	System.out.println(" Enter the n2:");
	int n1=Sc.nextInt();
	int n2=Sc.nextInt();
	System.out.println( + n1 + "+" + n2 + "=" +(n1+n2)); 
    System.out.println( + n1 + "-" + n2 + "=" +(n1-n2));
    System.out.println( + n1 + "*" + n2 + "=" +(n1*n2));	
	System.out.println( + n1 + "/" + n2 + "=" +(n1/n2));	
	System.out.println( + n1 + "%" + n2 + "=" +(n1%n2));	
  }
	
}