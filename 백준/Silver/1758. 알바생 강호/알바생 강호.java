import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        Integer[] tips = new Integer[N];

        for (int i = 0; i < N; i++) {
            tips[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(tips, (a, b) -> b - a);

        long totalTip = 0;

        for (int i = 0; i < N; i++) {
            int tip = tips[i] - i;
            if (tip > 0) {
                totalTip += tip;
            }
        }

        System.out.println(totalTip);
    }
}

