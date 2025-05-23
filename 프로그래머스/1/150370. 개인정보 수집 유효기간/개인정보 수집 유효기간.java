import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> result = new ArrayList<>();
        Map<String, Integer> termMap = new HashMap<>();

        for (String term : terms) {
            String[] parts = term.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        int todayDays = toDays(today);

        for (int i = 0; i < privacies.length; i++) {
            String[] parts = privacies[i].split(" ");
            String dateStr = parts[0];
            String type = parts[1];

            int termMonths = termMap.get(type);
            int privacyDays = toDays(dateStr);
            int expireDays = privacyDays + (termMonths * 28);

            if (expireDays <= todayDays) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(i -> i).toArray();
    }

    private int toDays(String dateStr) {
        String[] parts = dateStr.split("\\.");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);
        return year * 12 * 28 + month * 28 + day;
    }
}
