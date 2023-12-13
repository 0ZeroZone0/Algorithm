class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int answer_a = 0;
        int answer_b = 0;
        
        String num_1 = Integer.toString(a) + Integer.toString(b);
        String num_2 = Integer.toString(b) + Integer.toString(a);
        answer_a = Integer.parseInt(num_1);
        answer_b = Integer.parseInt(num_2);
        
        if(answer_a > answer_b){
            answer = answer_a;
        }else{
            answer = answer_b;
        }
        
        return answer;
    }
}