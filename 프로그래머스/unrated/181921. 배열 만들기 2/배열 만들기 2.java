import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int l, int r) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = l; i <= r; i++) {
            if (String.valueOf(i).matches("[05]+")) {
                resultList.add(i);
            }
        }

        if (resultList.isEmpty()) {
            return new int[]{-1};
        }

        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }

        return resultArray;
    }
}