public class Solution {

    public String solution(int q, int r, String code) {
        int[] intArr = new int[code.length()];

        for(int i = 0; i < code.length(); i++){
            intArr[i] = i;
        }

        String answer = "";


        for(int i = 0; i < code.length(); i++){
            int count = 0;
            int j = intArr[i];
            if(j % q == r){
                 answer += code.charAt(i);
            };
        }
        return answer;
    }
}