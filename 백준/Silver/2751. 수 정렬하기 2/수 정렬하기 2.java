import java.util.*;
import java.io.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        long[] A = new long[N];

        for(int i = 0 ; i < N ; i++) {
            A[i] = Long.parseLong(br.readLine());
        }
        
        Arrays.sort(A);
        
        for(long l : A) {
            sb.append(l).append("\n");
        }
 
        System.out.println(sb);
    }
}
