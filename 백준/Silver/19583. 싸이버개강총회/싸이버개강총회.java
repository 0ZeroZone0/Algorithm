import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String startTime = st.nextToken();
        String endTime = st.nextToken();
        String finishTime = st.nextToken();

        HashSet<String> attendanceSet = new HashSet<>();
        HashSet<String> leaveSet = new HashSet<>();

        String input;
        while ((input = br.readLine()) != null) {
            st = new StringTokenizer(input);
            String time = st.nextToken();
            String name = st.nextToken();

            if (time.compareTo(startTime) <= 0) {
                attendanceSet.add(name);
            } else if (time.compareTo(endTime) >= 0 && time.compareTo(finishTime) <= 0) {
                if (attendanceSet.contains(name)) {
                    leaveSet.add(name);
                }
            }
        }

        System.out.println(leaveSet.size());
    }
}

