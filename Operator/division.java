import java.util.*;

public class division 
	{
		public static void main(String[] Args){

				System.out.println("PROGRAM FOR DIVISION");
				Scanner sc = new Scanner(System.in);

				System.out.print("Enter a number : ");
				double num1 = sc.nextDouble();

				System.out.print("Enter second number : ");
				double num2 = sc.nextDouble();

				double dIv= num1 / num2;
				System.out.printf("The division of both numbers is: "+dIv);

			}
	}
