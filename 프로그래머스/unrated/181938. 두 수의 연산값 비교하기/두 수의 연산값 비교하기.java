class Solution {
    public int solution(int a, int b) {
                    int answer = 0;
                    String answer1 = (a + "") + (b + "");

                    int test = 2 * a * b;

                    if ((Integer.parseInt(answer1) == test)) return (a + b);
                    else if ((Integer.parseInt(answer1) > test)) return Integer.parseInt(answer1);
                    else return test;
    }
}