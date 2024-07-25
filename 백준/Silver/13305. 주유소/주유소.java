import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        long[] distance = new long[n - 1];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
            distance[i] = Long.parseLong(st.nextToken());
        }

        long[] price = new long[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            price[i] = Long.parseLong(st.nextToken());
        }

        long totalCost = 0;
        long minPrice = price[0];

        for (int i = 0; i < n - 1; i++) {
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            totalCost += minPrice * distance[i];
        }

        System.out.println(totalCost);
    }
}

