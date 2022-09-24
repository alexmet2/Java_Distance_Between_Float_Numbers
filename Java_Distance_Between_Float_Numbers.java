import java.util.Scanner;

public class Java_Distance_Between_Float_Numbers {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		float apo;
		System.out.println("Hello");
		System.out.println("Input 1st number: ");
		float x = scan.nextFloat();
		System.out.println("Input 2nd number: ");
		float y = scan.nextFloat();
		x=(int)(Math.round(x));
		y=(int)(Math.round(y));
		apo = x - y;
		System.out.println("Before conversion: ");
		System.out.println(x);
		System.out.println(y);
		if (apo < 0) {
			apo = apo * (-1);
		}
		System.out.println("Distance between the numbers: ");
		System.out.println(apo);
		scan.close();
	}

}
