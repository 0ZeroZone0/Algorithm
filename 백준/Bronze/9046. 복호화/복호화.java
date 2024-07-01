import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int num = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < num; i++) {
            String line = br.readLine();
            
            int[] frequency = new int[26];
            
            for (char c : line.toCharArray()) {
                if (c >= 'a' && c <= 'z') {
                    frequency[c - 'a']++;
                }
            }
            
            int maxFreq = 0;
            char mostFrequentChar = '?';
            boolean isCheck = false;
            
            for (int j = 0; j < 26; j++) {
                if (frequency[j] > maxFreq) {
                    maxFreq = frequency[j];
                    mostFrequentChar = (char) (j + 'a');
                    isCheck = false;
                } else if (frequency[j] == maxFreq) {
                    isCheck = true;
                }
            }
            
            if (isCheck) {
                System.out.println("?");
            } else {
                System.out.println(mostFrequentChar);
            }
        }
        
        br.close();
    }
}

