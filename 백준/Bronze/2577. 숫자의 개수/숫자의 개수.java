import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int answer = A * B * C;
        int[] nums = new int[10];

        for(char c : String.valueOf(answer).toCharArray()) {
            if(c == '0') nums[0]++;
            else if(c == '1') nums[1]++;
            else if(c == '2') nums[2]++;
            else if(c == '3') nums[3]++;
            else if(c == '4') nums[4]++;
            else if(c == '5') nums[5]++;
            else if(c == '6') nums[6]++;
            else if(c == '7') nums[7]++;
            else if(c == '8') nums[8]++;
            else nums[9]++;
        }

        for(int num : nums) {
            System.out.println(num);
        }
    }
}
