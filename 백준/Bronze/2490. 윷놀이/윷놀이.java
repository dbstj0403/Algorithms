import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i < 3; i++) {
            String[] arr = br.readLine().split(" ");
            int[] arr2 = new int[4];
            for(int j = 0; j < 4; j++) {
                arr2[j] = Integer.parseInt(arr[j]);
            }

            int zero_count = 0;
            int one_count = 0;

            for(int item : arr2) {
                if(item == 0) {
                    zero_count++;
                }
                else {
                    one_count++;
                }
            }

            if(zero_count == 1) System.out.println("A");
            else if(zero_count == 2) System.out.println("B");
            else if(zero_count == 3) System.out.println("C");
            else if(zero_count == 4) System.out.println("D");
            else if(one_count == 4) System.out.println("E");
        }
    }
}
