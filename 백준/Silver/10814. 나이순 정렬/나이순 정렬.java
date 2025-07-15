import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<int[]> list = new ArrayList<>();
        HashMap<Integer, String> map = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());

        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int age = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            int idx = i;

            map.put(idx, name);
            list.add(new int[] {age, idx});
        }

        list.sort(new Comparator<int[]>() {
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                else{
                    return o1[0] - o2[0];
                }
            }
        });

        for(int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)[0] + " " + map.get(list.get(i)[1])).append("\n");
        }

        System.out.println(sb);
    }
}
