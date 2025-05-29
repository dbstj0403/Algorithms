import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();

        // 입력받은 문자열에 대해서 각 알파벳이 처음 등장하는 위치를 공백으로 구분해서 출력

        int[] arr = new int[26];

        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }

        int idx = 0;
        for(char c : line.toCharArray()){
            // 만약에 아스키코드 98 -> 98 - 97 = 1 인덱스 1 위치
            int num = (int) c - 97;
            if(arr[num] == -1){
                arr[num] = idx;
            }
            idx++;
        }

        for(int i = 0; i < 26; i++){
            System.out.print(arr[i] + " ");
        }

        br.close();
    }
}
