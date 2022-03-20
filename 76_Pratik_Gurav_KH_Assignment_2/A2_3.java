import java.util.Scanner;
class A2_3
{
 public static void main(String args[])
 {
   Scanner sc= new Scanner(System.in);
   System.out.println(" Enter the first Dividend:");
   System.out.println(" Enter the second Divisor:");
   int n1 = sc.nextInt();
   int n2 =sc.nextInt();
   int k= n1/n2;
   System.out.println(+k);
  }
}
 