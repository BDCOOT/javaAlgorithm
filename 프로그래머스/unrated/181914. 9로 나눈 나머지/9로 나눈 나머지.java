class Solution {
        public int solution(String number) {

        int[] intArr = new int[number.length()];

        for(int i = 0; i < number.length(); i++){
            intArr[i] = Integer.parseInt(String.valueOf(number.charAt(i)));
        }

        int sum = 0;

        for(int i = 0; i < intArr.length; i++){
            sum += intArr[i];
        }

        return sum % 9;
    }
}