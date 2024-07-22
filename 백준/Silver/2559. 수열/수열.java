import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] numbers = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        int maxSum = 0;
        int currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += numbers[i];
        }

        maxSum = currentSum;

        for (int i = k; i < n; i++) {
            currentSum = currentSum + numbers[i] - numbers[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println(maxSum);
    }
}

