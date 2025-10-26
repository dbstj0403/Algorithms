import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        int zeroGroup = 0;
        int oneGroup = 0;

        char prev = s.charAt(0);
        if (prev == '0') zeroGroup++;
        else oneGroup++;

        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (cur != prev) { // 그룹이 바뀔 때마다 count++
                if (cur == '0') zeroGroup++;
                else oneGroup++;
            }
            prev = cur;
        }

        System.out.println(Math.min(zeroGroup, oneGroup));
    }
}
