class Solution {
    public int solution(int[] num_list) {
        int gop = 1;
        int hap = 0;

        for(int i = 0; i < num_list.length; i++){
            gop *= num_list[i];
            hap += num_list[i];
        }

        int hapjegop = hap * hap;

        System.out.println(gop);
        System.out.println(hapjegop);
        int answer = gop > hapjegop ? 0 : 1;

        return answer;
    }
}