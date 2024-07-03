import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] c_arr = br.readLine().toCharArray();
        int flag = 3; // 1: 자바 스타일, 2: C++ 스타일, 0: 에러, 3: 미확정
        
        // 첫 문자 검사: 소문자가 아니면 Error!
        if (c_arr[0] < 'a' || c_arr[0] > 'z') {
            flag = 0;
        } else {            
            // 두 번째 문자부터 검사
            for (int i = 1; i < c_arr.length; i++) {
                char c = c_arr[i];
                if (c == '_') {
                    // 언더바('_')
                    if (flag == 1) {
                        // 자바 스타일인데 언더바가 나오면 에러
                        flag = 0;
                        break;
                    } else {
                        // C++ 스타일 또는 미확정
                        // 마지막에 언더바가 나오면 에러
                        if (i == c_arr.length - 1) {
                            flag = 0;
                            break;
                        }
                        // 언더바가 연속으로 나오면 에러
                        else if (c_arr[i + 1] == '_') {
                            flag = 0;
                            break;
                        } else {
                            flag = 2;
                        }
                    }
                } else if (c >= 'A' && c <= 'Z') {
                    // 대문자
                    if (flag == 2) {
                        // C++ 스타일인데 대문자가 나오면 에러
                        flag = 0;
                        break;
                    } else {
                        // 자바 스타일 또는 미확정
                        flag = 1;
                    }
                }
            }
        }
        
        // 에러 처리
        if (flag == 0) {
            System.out.println("Error!");
        } else if (flag == 1) {
            // 자바 스타일을 C++ 스타일로 변환
            convertToC(c_arr);
        } else if (flag == 2) {
            // C++ 스타일을 자바 스타일로 변환
            convertToJava(c_arr);
        } else {
            // 원래 문자열 그대로 출력 (자바 스타일 또는 C++ 스타일이 아닐 경우)
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < c_arr.length; i++) {
                sb.append(c_arr[i]);
            }
            System.out.println(sb.toString());
        }
    }
 
    private static void convertToJava(char[] c_arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c_arr.length; i++) {
            char c = c_arr[i];
            if (c == '_') {
                i++;
                sb.append((char)(c_arr[i] - 32)); // 다음 문자를 대문자로 변환
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
 
    private static void convertToC(char[] c_arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < c_arr.length; i++) {
            char c = c_arr[i];
            if (c >= 'A' && c <= 'Z') {
                sb.append('_');
                sb.append((char)(c + 32)); // 대문자를 소문자로 변환하고 언더바 추가
            } else {
                sb.append(c);
            }
        }
        System.out.println(sb.toString());
    }
}
