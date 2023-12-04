import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];

       StringTokenizer st = new StringTokenizer(br.readLine(), " ");

      for(int i =0; i<num; i++) {
    	  arr[i] = Integer.parseInt(st.nextToken());
      }
     
      Arrays.sort(arr);

      System.out.print(arr[0] + " "+ arr[num-1]);
      br.close();
       
	}
}