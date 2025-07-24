import java.util.*;
 

public class multiplication
{
	public static void main(String[] Args){
		
		System.out.println("PROGRAM FOR MULTIPLICATION");
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Enter a number : ");
			double num1 = sc.nextDouble();

			System.out.print("Enter second number : ");
			double num2 = sc.nextDouble();

			double product = num1 * num2;
			System.out.printf("The product of both numbers is: "+product);
		
	}
}
