import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int tot_num = Integer.parseInt(br.readLine());
		int tot_cnt = Integer.parseInt(br.readLine());
		int result = 0;
		
		for(int i=0; i<tot_cnt; i++) {
				String str = br.readLine();
				StringTokenizer st = new StringTokenizer(str , " ");
				
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				result += (a*b);
				
		}
		if(tot_num == result) {
			System.out.println("Yes");
		}else {
			System.out.println("No");	
		}
	}
}
