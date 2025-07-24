import java.util.*;


public class substraction 
	{
		public static void main(String[] Args){

				System.out.println("PROGRAM FOR SUBSTRACTION");
				Scanner sc = new Scanner(System.in);

				System.out.print("Enter a number : ");
				double num1 = sc.nextDouble();

				System.out.print("Enter second number : ");
				double num2 = sc.nextDouble();

				double difff = num1 - num2;
				System.out.printf("The difference of both numbers is: "+difff);

			}
	}
