import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException{
	 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  
    	StringTokenizer st = new StringTokenizer( br.readLine(), " ");
    	
    	int a  = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	int c = Integer.parseInt(st.nextToken());
    	
    	int result;
    	
    	// 다 다를때
    	if(a != b && a != c && b != c) {
    		int max = Math.max(a,  Math.max(b, c));
    		result = max * 100;
    	//모두가 같음 
    	}else if(a == b && a == c){
    		result = 10000+a*1000;
    	// a 가 c랑 같음 
    	}else  if(a == b || a == c) {
    		result = 1000+a*100;
    	// b 랑 c 가 같음 
    	}else {
    		result = 1000+b*100;
    	}
    	
    	System.out.println(result);
    	
    }
	
}