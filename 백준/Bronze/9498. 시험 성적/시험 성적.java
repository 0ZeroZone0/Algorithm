import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
    public static void main(String[] args) throws IOException{
	 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str = br.readLine();
        
        int A = Integer.parseInt(str);

        if(A >= 90) {
        	System.out.println("A");
        }else if(A >= 80) {
        	System.out.println("B");
        }else if(A >= 70) {
        	System.out.println("C");
        }else if(A >= 60) {
        	System.out.println("D");
        }else {
        	System.out.println("F");
        }
    	
    }
	
}