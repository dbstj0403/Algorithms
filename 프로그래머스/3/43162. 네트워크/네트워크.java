import java.util.*;

class Solution {
    static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
    static boolean[] visited;
    static int N;
    
    public int solution(int n, int[][] computers) {
        // n = 컴퓨터의 개수, 연결 정보 computers
        N = n;
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++) {
            edges.add(new ArrayList<>());
        }
        
        for(int i = 0; i < computers.length; i++) {
            for(int j = 0; j < n; j++) {
                if(computers[i][j] == 1) addEdge(i, j);
            }
        }
        
        int cnt = 0;
        
        for(int i = 0; i < n; i++) {
            cnt += bfs(i);
        }
        
        return cnt;
    }
    
    private void addEdge(int a, int b) {
        edges.get(a).add(b);
        edges.get(b).add(a);
    }
    
    private int bfs(int start) {
        if(visited[start]) return 0;
    
        Queue<Integer> q = new LinkedList<>();
        
        visited[start] = true;
        q.add(start);
        
        while(!q.isEmpty()){
            int cur = q.poll();
            for(int edge : edges.get(cur)) {
                if(!visited[edge]) {
                    visited[edge] = true;
                    q.add(edge);
                }
            }
        }
        
        return 1;
    }
}