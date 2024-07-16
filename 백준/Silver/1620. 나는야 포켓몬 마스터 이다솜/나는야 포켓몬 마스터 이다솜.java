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
        int m = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> nameToNumber = new HashMap<>();
        HashMap<Integer, String> numberToName = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String name = br.readLine();
            nameToNumber.put(name, i);
            numberToName.put(i, name);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            if (isNumeric(query)) {
                int number = Integer.parseInt(query);
                sb.append(numberToName.get(number)).append('\n');
            } else {
                sb.append(nameToNumber.get(query)).append('\n');
            }
        }

        System.out.print(sb);
    }

    private static boolean isNumeric(String str) {
        return str.matches("\\d+"); 
    }
}


