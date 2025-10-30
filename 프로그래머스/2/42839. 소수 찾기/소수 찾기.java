import java.util.*;

class Solution {
    static Set<Integer> set = new HashSet<>();
    static boolean[] visited;

    public int solution(String numbers) {
        visited = new boolean[numbers.length()];
        dfs(numbers, "", 0);
        
        int count = 0;
        for (int num : set) {
            if (isPrime(num)) count++;
        }
        return count;
    }

    // 백트래킹으로 가능한 모든 숫자 조합 만들기
    static void dfs(String numbers, String current, int depth) {
        if (!current.equals("")) {
            set.add(Integer.parseInt(current)); // 숫자 만들면 Set에 추가
        }
        if (depth == numbers.length()) return;

        for (int i = 0; i < numbers.length(); i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(numbers, current + numbers.charAt(i), depth + 1);
                visited[i] = false;
            }
        }
    }

    // 소수 판별
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
