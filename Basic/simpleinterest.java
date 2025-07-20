import java.util.*;

public class simpleinterest
{
	public static void main(String[] args){
		
		System.out.println("        PROGRAM TO FIND SIMPLE INTEREST     ");
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("ENTER THE PRINCIPAL AMOUNT : ");
		int p = sc.nextInt();
		
     	System.out.print("ENTER THE RATE OF INTEREST PER YEAR : ");
		int r = sc.nextInt();
			
		System.out.print("ENTER THE TIME IN YEARS: ");
		int t = sc.nextInt();
			
			
		int i = (p*r*t)/100;
			
		System.out.println(" SIMPLE INTEREST IS : "+i);
			
	}
}
