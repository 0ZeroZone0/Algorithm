import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int testCases = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();

        for (int t = 0; t < testCases; t++) {
            String input = br.readLine();
            Stack<Character> leftStack = new Stack<>();
            Stack<Character> rightStack = new Stack<>();

            for (char ch : input.toCharArray()) {
                switch (ch) {
                    case '<':
                        if (!leftStack.isEmpty()) {
                            rightStack.push(leftStack.pop());
                        }
                        break;
                    case '>':
                        if (!rightStack.isEmpty()) {
                            leftStack.push(rightStack.pop());
                        }
                        break;
                    case '-':
                        if (!leftStack.isEmpty()) {
                            leftStack.pop();
                        }
                        break;
                    default:
                        leftStack.push(ch);
                        break;
                }
            }

            while (!leftStack.isEmpty()) {
                rightStack.push(leftStack.pop());
            }
            while (!rightStack.isEmpty()) {
                result.append(rightStack.pop());
            }
            result.append('\n');
        }

        System.out.print(result);
    }
}
