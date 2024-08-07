import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;

        while (n % 5 != 0 && n >= 0) {
            n -= 2;
            count++;
        }

        if (n < 0) {
            System.out.println(-1);
        } else {
            count += n / 5;
            System.out.println(count);
        }
    }
}
