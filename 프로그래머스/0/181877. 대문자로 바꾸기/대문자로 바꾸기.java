class Solution {
    public String solution(String myString) {
        String answer = "";
        
        for(int i = 0; i< myString.length();i++){
            char c = myString.charAt(i);
            if(Character.isUpperCase(c)){
                answer += c;
            } else{
                answer += Character.toUpperCase(c);
            }
        }
        
        return answer;
    }
}