import java.util.*;

class Solution {
    public List solution(int[] num_list) {
        List<Integer> answer = new ArrayList<>();
        
        int last = num_list[num_list.length - 1]; 
        int pre = num_list[num_list.length - 2]; 
        
        for(int i = 0; i < num_list.length; i++){
            answer.add(num_list[i]);
        }
        
        if(last > pre){
            answer.add(last - pre);
        } else {
            answer.add(last * 2);
        }
        
        return answer;
    }
}