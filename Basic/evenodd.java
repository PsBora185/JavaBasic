import java.util.*;

public class evenodd
{
	public static void main(String[] args){
		
		System.out.println("                PROGRAM TO FIND EVEN OR ODD            ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER THE NUMBER : ");
		int n = sc.nextInt();
		
		if(n%2 == 0)
		{
		    System.out.println(n+" IS EVEN");
		}
		else
		{
			System.out.println(n+" IS ODD");
		}
	}
}
