import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();

        for (String phone : phone_book) {
            set.add(phone);
        }

        for (String phone : phone_book) {
            for (int i = 1; i < phone.length(); i++) {  // 접두사 길이 1 ~ n-1
                String prefix = phone.substring(0, i);
                if (set.contains(prefix)) {
                    return false;
                }
            }
        }
        return true;
    }
}
