import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException{
	 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    	StringTokenizer st = new StringTokenizer( br.readLine(), " ");
    	
    	int H  = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	int plus = Integer.parseInt(br.readLine());
    	
    	int sub_M = M+plus;
    	
    	if(sub_M >= 60) {
    		H += (sub_M / 60);
    		M = sub_M % 60;
    		
    		if(H >= 24) {
    			H -=24;
    		}
    		
    		if(M >=60) {
    			M -= 60;
    		}
    		
    		System.out.println(H +" "+ M);
    	}else {
    		System.out.println(H +" "+ sub_M);
    	    		
    	}
    	
    	
    }
	
}