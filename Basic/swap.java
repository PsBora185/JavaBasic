import java.util.*;

public class swap
{
	public static void main(String[] args){
		
		System.out.println("                PROGRAM TO SWAP TWO NUMBERS           ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER FIRST NUMBER  : ");
		int a = sc.nextInt();

		System.out.print("ENTER SECOND NUMBER : ");
		int b = sc.nextInt();
		
		System.out.println("THE FIRST NUMBER IS "+a+" AND THE SECOND NUMBER IS "+b);

		b=a+b;
        a=b-a;
        b=b-a;		
		System.out.println("AFTER SWAPPING THE FIRST NUMBER IS "+a+" AND THE SECOND NUMBER IS "+b);
		
	}
}
