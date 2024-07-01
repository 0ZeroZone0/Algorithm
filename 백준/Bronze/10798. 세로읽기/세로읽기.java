import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] words = new String[5];
        int maxLength = 0;

        for (int i = 0; i < 5; i++) {
            words[i] = br.readLine();
            if (words[i].length() > maxLength) {
                maxLength = words[i].length();
            }
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < words[j].length()) {
                    result.append(words[j].charAt(i));
                }
            }
        }

        System.out.println(result.toString());
    }
}


