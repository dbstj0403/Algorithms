import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];

        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // 1. 산술평균
        int avg = 0;
        double sum = 0;
        for(int num : arr){
            sum += num;
        }
        avg = (int) Math.round(sum / N);
        System.out.println(avg);

        // 2. 중앙값
        Arrays.sort(arr);
        int len = arr.length;
        int mid = arr[len / 2];
        System.out.println(mid);

        // 3. 최빈값 (여러 개일 경우 최빈값 중 두 번째로 작은 값)
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        List<Integer> list = new ArrayList<>();

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(maxEntry == null || entry.getValue() > maxEntry.getValue()){
                maxEntry = entry;
            }
        }

        list.add(maxEntry.getKey());
        map.remove(maxEntry.getKey());

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == maxEntry.getValue()){
                list.add(entry.getKey());
            }
        }

        Collections.sort(list);

        if(list.size() == 1){
            System.out.println(list.get(0));
        }
        else{
            System.out.println(list.get(1));
        }

        // 4. 최댓값과 최솟값의 차이
        int diff = arr[len - 1] - arr[0];
        System.out.println(diff);
    }
}
