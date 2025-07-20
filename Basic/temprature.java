import java.util.*;

public class temprature
{
	public static void main(String[] Args){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTER TEMPRATURE IN ° CELSIUS : ");
		float temp = sc.nextFloat();
		
		float f = (9/5)*temp + 32;
		
		System.out.print(temp+"° celsius is equal to ");
    	System.out.println(f+" Fahrenheit");
		
	}
}
