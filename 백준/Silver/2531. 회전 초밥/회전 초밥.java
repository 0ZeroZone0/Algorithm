import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] belt = new int[n];
        for (int i = 0; i < n; i++) {
            belt[i] = Integer.parseInt(br.readLine());
        }

        HashMap<Integer, Integer> sushiCount = new HashMap<>();
        int maxKinds = 0;

        for (int i = 0; i < k; i++) {
            sushiCount.put(belt[i], sushiCount.getOrDefault(belt[i], 0) + 1);
        }

        maxKinds = sushiCount.size() + (sushiCount.containsKey(c) ? 0 : 1);

        for (int i = 1; i < n; i++) {
            int prevSushi = belt[i - 1];
            if (sushiCount.get(prevSushi) == 1) {
                sushiCount.remove(prevSushi);
            } else {
                sushiCount.put(prevSushi, sushiCount.get(prevSushi) - 1);
            }

            int newSushi = belt[(i + k - 1) % n];
            sushiCount.put(newSushi, sushiCount.getOrDefault(newSushi, 0) + 1);

            int currentKinds = sushiCount.size() + (sushiCount.containsKey(c) ? 0 : 1);
            maxKinds = Math.max(maxKinds, currentKinds);
        }

        System.out.println(maxKinds);
    }
}
