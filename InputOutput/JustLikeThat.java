package InputOutput;
import java.util.*;
public class JustLikeThat {
	public static void printBytes(String msg, byte[] b){
	    System.out.print(msg + " = ");
	    for(int i = 0; i < b.length; i++){
	        System.out.print("" + String.format("%02X", b[i]));
	    }
	    System.out.println("\n");
	}
	public static void main(String[] args)
	{
		byte[] message = new byte[8];
		printBytes("message: " + message.length + " = ", message);
		System.out.println(Arrays.toString(message));
	}

}
