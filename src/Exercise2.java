import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Exercise2 {

	public static void main(String[] args) throws IOException {
		
	
	BufferedWriter write = new BufferedWriter(new FileWriter("C:\\Users\\Gabby\\Documents\\Programming Fundamentals\\userStrings.txt"));
	
	Scanner scan = new Scanner(System.in);
	String userstring;
	
	
	System.out.println("Enter word or phrase, write DONE to quit:");
	boolean choice = true;
	
	do
	{
		userstring = scan.nextLine();
		if(userstring.equals("DONE"))
		{
			choice = false;
			break;
		}
		else
		{
			write.write(userstring);
			write.newLine();
		}
	}
	while(choice);
		
		write.close();
		scan.close();
	
}
}		