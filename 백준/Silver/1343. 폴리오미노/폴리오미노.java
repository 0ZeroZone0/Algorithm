import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        StringBuilder sb = new StringBuilder();
 
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                int count = 0;
 
                while (i < input.length() && input.charAt(i) == 'X') {
                    count++;
                    i++;
                }
               
                if (count % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                sb.append("AAAA".repeat(count / 4));
                sb.append("BB".repeat(count % 4 / 2));
                i--; 
            } else {
                sb.append(input.charAt(i));
            }
        }

        System.out.println(sb.toString().trim());
    }
}


