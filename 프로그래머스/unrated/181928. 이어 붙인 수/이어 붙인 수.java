class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String result_a = "";
        String result_b = "";
        
        for(int i=0; i<num_list.length; i++){
            if(num_list[i]%2 == 0){
                result_a += ""+num_list[i];
            }else{
                result_b += ""+num_list[i];   
            }
        }
        answer = Integer.parseInt(result_a) +Integer.parseInt(result_b);
        
        return answer;
    }
}