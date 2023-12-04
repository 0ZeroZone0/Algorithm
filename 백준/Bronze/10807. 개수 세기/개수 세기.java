import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
    	StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    	
        for(int i =0; i<arr.length; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int findNum = Integer.parseInt(br.readLine());
        
        int count = 0;
        for(int i=0; i<arr.length; i++) {
        	if(arr[i] == findNum) {
        		count++;
        	}
        }
        System.out.print(count);
        br.close();
	}
}