import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int TC = Integer.parseInt(st.nextToken());
		
		for (int t = 0; t < TC; t++) {
			int res = 0;
			st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			
			for (int B = 2; B <= 64; B++) {
				if(res==1)
					break;
				
				int mok = N;
				int len =0;
				int[] resArr = new int[20];

				while(true) {
					if(mok==0)
						break;
					
					resArr[len++] = mok%B;
					mok = mok / B;
				}
				
				for (int i = 0; i <= (len/2); i++) {
					if(resArr[i]==resArr[len-1-i]) {
						if(i==len/2)
							res = 1;
					} else {
						break;
					}
					
				}
			}
			
			System.out.println(res);
			
		}
	}

}