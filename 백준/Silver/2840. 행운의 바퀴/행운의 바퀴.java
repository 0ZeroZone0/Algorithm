import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Character> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add('0');
        }

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);

            for (int j = 0; j < S; j++) {
                arrayList.add(arrayList.get(0));
                arrayList.remove(0);
            }

            if (arrayList.get(arrayList.size() - 1) == '0') {
                for (int j = 0; j < N; j++) {
                    if (c == arrayList.get(j)) {
                        System.out.println("!");
                        System.exit(0);
                    }
                }

                arrayList.remove(arrayList.size() - 1);
                arrayList.add(c);

            } else if (arrayList.get(arrayList.size() - 1) == c) {
                continue;
            } else {
                System.out.println("!");
                System.exit(0);
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            if (arrayList.get(arrayList.size() - 1 - i) == '0') {
                sb.append("?");
            } else {
                sb.append(arrayList.get(arrayList.size() - 1 - i));
            }
        }

        System.out.println(sb);
    }
}