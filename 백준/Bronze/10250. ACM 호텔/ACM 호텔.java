import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            
            if (n % h == 0) {
                sb.append(h);
            } else {
                sb.append(n % h);
            }
            
            double room = Math.ceil((double)n / (double)h);
            
            if (room < 10) {
                sb.append("0");
            }
            
            sb.append((int)room + "\n");
        }
        
        System.out.print(sb);
    }
}