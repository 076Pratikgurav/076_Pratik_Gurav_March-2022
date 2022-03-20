import java.util.Scanner;
class A2_7
{
   public static void main (String args[])
   {
	   Scanner sc = new Scanner (System.in);//declearation of scanner class object
	   System.out.println("Enter interger numer:");  // msg
	   int num1 = sc.nextInt();   //getting the input from user
	   System.out.println("Enter integar=number:");
 
	   
	  for (int i=0; i<10;i++)
	  {System.out.println(num1 + " x " + (i+1) + " = " + 
     (num1 * (i+1)));
       }
   }


   
}
