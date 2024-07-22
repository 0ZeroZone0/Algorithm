import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] numbers = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int number : numbers) {
            int target = m - number;
            if (map.getOrDefault(target, 0) > 0) {
                count++;
                map.put(target, map.get(target) - 1);
            } else {
                map.put(number, map.getOrDefault(number, 0) + 1);
            }
        }

        System.out.println(count);
    }
}

