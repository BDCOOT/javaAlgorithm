class Solution {
    public int solution(int n, String control) {
        int inputInt = n;

        String input = control;

        char[] charArr = new char[input.length()];

        for(int i = 0; i < input.length(); i++){
            charArr[i] = input.charAt(i);
            if(charArr[i] == 'w') inputInt += 1;
            else if (charArr[i] == 's') {inputInt -= 1;}
            else if (charArr[i] == 'd') {inputInt += 10;}
            else if (charArr[i] == 'a') {inputInt -= 10;}
        }
        return inputInt;
    }
}