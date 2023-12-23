class Solution { 
   
        //등차 수열 공식  a_{n}=a_{x}+(n-x)d
    public int solution(int a, int d, boolean[] included) {
        int sum = 0;
        for(int i = 1; i <= included.length; i++){
            if(included[i - 1] == true)
                sum += (a + (i - 1) * d);
        }
        return sum;
    }
}