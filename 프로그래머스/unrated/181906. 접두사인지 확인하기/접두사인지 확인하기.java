import java.util.ArrayList;
import java.util.List;

class Solution {
    public int solution(String my_string, String is_prefix) {
        List<String> prefixList = new ArrayList<>();

        for (int i = 1; i < my_string.length(); i++){
            prefixList.add(my_string.substring(0,i));
        }

        return prefixList.contains(is_prefix) ? 1 : 0;
    }
}