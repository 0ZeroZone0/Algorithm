import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String pattern = br.readLine();
        
        String regex = pattern.replace("*", ".*");
        
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            
            if (str.matches(regex)) {
                System.out.println("DA");
            } else {
                System.out.println("NE");
            }
        }
	}
}
