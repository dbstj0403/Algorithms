import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 도시의 개수
        int total = 0;
        boolean flag = true;

        List<Integer> distList = new ArrayList<>();
        List<Integer> costList = new ArrayList<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++){
            distList.add(Integer.parseInt(st.nextToken()));
        }

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N - 1; i++){
            costList.add(Integer.parseInt(st.nextToken()));
        }

        // 싼 곳에서 제일 많이 넣고, 이외의 도시에서는 다음 도시로 갈 만큼만 넣기
        int minCost = Collections.min(costList);

        for(int i = 0; i < distList.size(); i++){
            if(costList.get(i) != minCost && flag){
                total += costList.get(i) * distList.get(i);
            }
            else if(costList.get(i) == minCost && flag){
                int remain = 0;
                for(int j = i; j < distList.size(); j++){
                    remain += distList.get(j);
                }
                total += remain * minCost;
                flag = false;
            }
        }

        System.out.println(total);
    }
}
