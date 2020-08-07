import java.util.Scanner;

public class StringReversal {
	void reverse(String s) 
    { 
        if ((s==null)||(s.length() <= 1)) 
           System.out.println(s); 
        else
        { 
            System.out.print(s.charAt(s.length()-1)); 
            reverse(s.substring(0,s.length()-1)); 
        } 
    } 

	public static void main(String[] args) {
	    { 
	    	Scanner scan = new Scanner(System.in);
	        System.out.println("Enter a word for phase:");
	    	String s = scan.nextLine(); 
	        StringReversal obj = new StringReversal(); 
	        obj.reverse(s); 
	   
	    scan.close();
	    }     
			
		}
		
		
	}


