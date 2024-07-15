import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        List<BigInteger> numbers = new ArrayList<>();

        // 정규 표현식
        Pattern pattern = Pattern.compile("\\d+");

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            Matcher matcher = pattern.matcher(line);

            while (matcher.find()) {
                String numberStr = matcher.group();
                numbers.add(new BigInteger(numberStr));
            }
        }

        Collections.sort(numbers);

        StringBuilder sb = new StringBuilder();
        for (BigInteger number : numbers) {
            sb.append(number).append('\n');
        }

        System.out.print(sb);
    }
}
