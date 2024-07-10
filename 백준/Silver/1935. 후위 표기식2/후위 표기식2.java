import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        String postfix = br.readLine();
        double[] values = new double[n];
        
        for (int i = 0; i < n; i++) {
            values[i] = Double.parseDouble(br.readLine());
        }
        
        Stack<Double> stack = new Stack<>();
        
        for (char ch : postfix.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                stack.push(values[ch - 'A']);
            } else {
                double b = stack.pop();
                double a = stack.pop();
                
                switch (ch) {
                    case '+':
                        stack.push(a + b);
                        break;
                    case '-':
                        stack.push(a - b);
                        break;
                    case '*':
                        stack.push(a * b);
                        break;
                    case '/':
                        stack.push(a / b);
                        break;
                }
            }
        }

        System.out.printf("%.2f\n", stack.pop());
    }
}

