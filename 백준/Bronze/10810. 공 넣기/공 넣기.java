import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		
		int basket = Integer.parseInt(st.nextToken());
		int cnt = Integer.parseInt(st.nextToken()); 
		
		int startNum, endNum, ballNum = 0;
		
		int arr[] = new int[basket];
		
		for(int i=0;i<cnt;i++) {
			st = new StringTokenizer(br.readLine()," ");
			
			startNum = Integer.parseInt(st.nextToken())-1;
			endNum = Integer.parseInt(st.nextToken())-1;
			ballNum = Integer.parseInt(st.nextToken());
			
			for(int j=startNum;j<=endNum;j++) {
				arr[j] = ballNum;
			}
		}
		
		br.close();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
