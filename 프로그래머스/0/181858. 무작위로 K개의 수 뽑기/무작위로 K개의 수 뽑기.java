import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        
        for(int i = 0; i < arr.length; i++) {
            if(intList.size() == k) break;
            if(!intList.contains(arr[i])) intList.add(arr[i]);
        }
        
        while(intList.size() < k)
            intList.add(-1);
        
        return intList.stream().mapToInt(x->x).toArray();
    }
}