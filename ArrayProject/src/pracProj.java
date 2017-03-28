import java.util.*;

public class pracProj {
	
	public static void main( String[] args )  
    {  
		Scanner kb = new Scanner(System.in);
        int hex = kb.nextInt();
        
        String strHex = Integer.toHexString(hex);
        String strOctal = Integer.toOctalString(hex);
        
        System.out.println("The Hex Value of the decimal number " + hex + " is " + strHex);
        System.out.println("The Octal Value of the decimal number " + hex + " is " + strOctal);
        }  
    }  


