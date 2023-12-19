class Solution {
    public String[] solution(String[] names) {
        int length;

        if(names.length % 5 == 0){
            length = names.length / 5;
        } else length = names.length / 5 + 1;

        String[] answer = new String[length];

        int j = 0;
        for(int i = 0; i < length; i++){
            answer[i] = names[j];
            j += 5;
        }
        return answer;
    }
}