import java.util.Scanner;

public class DivisorCalc {
			
	public void main(String[] args) {
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the first Number");
		num1 = scan.nextInt();
		
		System.out.print("Enter the Second Number");
		num2 = scan.nextInt();
		
		int greatestComDiv = gcd(num1, num2);
		System.out.println("The Greatest Common Divider of " + num1 + " and " + num2 + "is: " + greatestComDiv);
		
		scan.close();	
	}

	private  static int gcd(int num1, int num2) {
		if (num2 == 0)
		{
			return num1;
	}
		return gcd(num2, num1%num2);
		
	}
}