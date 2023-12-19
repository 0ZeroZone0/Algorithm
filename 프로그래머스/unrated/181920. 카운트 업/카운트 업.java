import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = start_num; i<=end_num; i++){
            list.add(i);
        }
        
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        
        return arr;
    }
}