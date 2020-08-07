import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise1 {

	
	public static void main(String args[]) throws FileNotFoundException {

		Scanner scan = new Scanner(new File("C:\\Users\\Gabby\\Documents\\Programming Fundamentals\\input.csv"));
		String line = "";

		int max = 0, count = 1;
		String[] arr = null;

		System.out.println("Maximum values");

		while(scan.hasNext())

		{

		line = scan.nextLine();
		arr = line.split(",");
		max = 0;

		for(int i=0; i<arr.length; i++)
		{
		if(Integer.parseInt(arr[i]) > max)
		max = Integer.parseInt(arr[i]);
		}

		System.out.println("ROW " + count + " : " + max);
		count++;
		}

	}

}