import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String expression = br.readLine();

        String[] minusSplit = expression.split("-");

        int result = 0;

        for (String part : minusSplit[0].split("\\+")) {
            result += Integer.parseInt(part);
        }

        for (int i = 1; i < minusSplit.length; i++) {
            for (String part : minusSplit[i].split("\\+")) {
                result -= Integer.parseInt(part);
            }
        }

        System.out.println(result);
    }
}

