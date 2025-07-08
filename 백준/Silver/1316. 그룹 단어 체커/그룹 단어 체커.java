import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] str = new String[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            str[i] = br.readLine();
        }

        for(int i = 0; i < str.length; i++) {
            boolean[] flag = new boolean[26];
            String item = str[i];
            int k = 0;
            for(; k < item.length(); k++) {
                char c = item.charAt(k);
                if(k == 0){
                    flag[c - 'a'] = true;
                }
                else{
                    if(c == item.charAt(k - 1)) {
                        continue; // 이전 문자와 같은 경우 패스
                    }
                    else if(flag[c - 'a']) {
                        break;
                    }
                    else{
                        flag[c - 'a'] = true;
                    }
                }
            }

            if(k == item.length()) {
                count++;
            }
        }

        System.out.println(count);
    }
}
