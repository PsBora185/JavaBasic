import java.util.*;

public class reverse
	{
		public static void main(String[] Args){

			System.out.println("REVERSE OF 5 DIGIT NUMBERE \n");
			
			Scanner sc = new Scanner(System.in);

			System.out.print("ENTER A 5 DIGIT NUMBER : ");
			long num = sc.nextLong();
				
			long a,b,c,d,e ;
                
			a = num%10;
			b = num%100;
			c = num%1000;
			d = num%10000;
				
			d=(d-c)/100;
			c=(c-b);
			b=(b-a)*100;
			a*=10000;
			e = (num/10000);
						
			long rev = a+b+c+d+e;
				
			System.out.print("\n REVERSE OF "+num+" IS "+rev);

			

			}
	}
