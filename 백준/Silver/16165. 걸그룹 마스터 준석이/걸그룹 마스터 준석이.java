import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] firstLine = br.readLine().split(" ");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        HashMap<String, List<String>> groupToMembers = new HashMap<>();
        HashMap<String, String> memberToGroup = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String groupName = br.readLine();
            int memberCount = Integer.parseInt(br.readLine());
            List<String> members = new ArrayList<>();

            for (int j = 0; j < memberCount; j++) {
                String memberName = br.readLine();
                members.add(memberName);
                memberToGroup.put(memberName, groupName);
            }

            groupToMembers.put(groupName, members);
        }

        for (int i = 0; i < m; i++) {
            String query = br.readLine();
            int queryType = Integer.parseInt(br.readLine());

            if (queryType == 0) {
                List<String> members = groupToMembers.get(query);
                members.sort(String::compareTo);
                for (String member : members) {
                    sb.append(member).append("\n");
                }
            } else {
                sb.append(memberToGroup.get(query)).append("\n");
            }
        }

        System.out.println(sb);
    }
}

