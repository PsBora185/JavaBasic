import java.util.*;
 

public class add
	{
		public static void main(String[] Args){

				System.out.println("PROGRAM FOR ADDITION");
				Scanner sc = new Scanner(System.in);

				System.out.print("Enter a number : ");
				double num1 = sc.nextDouble();

				System.out.print("Enter second number : ");
				double num2 = sc.nextDouble();

				double sum = num1 + num2;
				System.out.printf("The sum of both numbers is: "+sum);

			}
	}
