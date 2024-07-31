import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String current = br.readLine();
        String alarm = br.readLine();
        
        // 현재 시간 초 단위 변환
        int cHour = (current.charAt(0) - '0') * 10 + current.charAt(1) - '0';
        int cMinute = (current.charAt(3) - '0') * 10 + current.charAt(4) - '0';
        int cSecond = (current.charAt(6) - '0') * 10 + current.charAt(7) - '0';
        
        int tHour = (alarm.charAt(0) - '0') * 10 + alarm.charAt(1) - '0';
        int tMinute = (alarm.charAt(3) - '0') * 10 + alarm.charAt(4) - '0';
        int tSecond = (alarm.charAt(6) - '0') * 10 + alarm.charAt(7) - '0';
        
        int cSecondAmount = cHour * 3600 + cMinute * 60 + cSecond;  // 현재 시간 초 단위 변환
        int tSecondAmount = tHour * 3600 + tMinute * 60 + tSecond;  // 알람 시간 초 단위 변환
       
        int nSecondAmount = tSecondAmount - cSecondAmount;  // 필요한 초 계산
       
        if(nSecondAmount <= 0)
            nSecondAmount += 24 * 3600;  // 음수인 경우 하루를 더함
        
        int h = nSecondAmount / 3600;  // 시간 계산
        int m = (nSecondAmount % 3600) / 60;  // 분 계산
        int s = nSecondAmount % 60;  // 초 계산
        
        String ans = String.format("%02d:%02d:%02d", h, m, s);
        System.out.println(ans);
    }
}

