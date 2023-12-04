import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       StringTokenizer st = new StringTokenizer(br.readLine(), " ");
       
       int num = Integer.parseInt(st.nextToken());
       int benchmark = Integer.parseInt(st.nextToken());
       
       st = new StringTokenizer(br.readLine(), " ");
       
       int[] arr = new int[num];
       for(int i=0; i<arr.length; i++) {
    	   arr[i] = Integer.parseInt(st.nextToken());
       }

      for(int i =0; i<arr.length; i++) {
    	  if(arr[i]<benchmark) {
    		  System.out.print(arr[i] +" ");
    	  }
      }
       
	}
}