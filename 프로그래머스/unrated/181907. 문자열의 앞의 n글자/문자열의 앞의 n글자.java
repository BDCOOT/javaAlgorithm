class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        char[] charArr = my_string.toCharArray();
        for(int i = 0; i < n; i++){
            answer += charArr[i];
        }

        return answer;
    }
}