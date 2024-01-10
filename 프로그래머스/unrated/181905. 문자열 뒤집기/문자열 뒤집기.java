class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = my_string.substring(s,e+1);
        
        StringBuffer sb = new StringBuffer(answer);
        String reverseSt = sb.reverse().toString();

        my_string = my_string.replaceAll(answer, reverseSt);
        return my_string;
    }
}