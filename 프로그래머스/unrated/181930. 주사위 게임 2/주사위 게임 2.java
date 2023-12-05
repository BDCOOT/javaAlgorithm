import java.util.Arrays;

class Solution {
        public int solution(int a, int b ,int c){
        //정렬을 하기위해 배열로 나열한다.
        int[] numbers = {a,b,c};
        Arrays.sort(numbers);
        //1. 0번원소와 2번원소가 동일하면 3개 일치
        if (numbers[0] == numbers[2]){
            return (a + b + c) * (a * a + b * b + c * c ) * (a * a * a + b * b * b + c * c * c);
        }
        //2. 0번원소와 1번원소가 같거나 1번원소가 같거나
        else if(numbers[0] == numbers[1] || numbers[1] == numbers[2]){
            return (a + b + c) * (a * a + b * b + c * c);
        }
        //3. 아니면 다다르다
        else{
            return (a + b + c);
        }
    }
}