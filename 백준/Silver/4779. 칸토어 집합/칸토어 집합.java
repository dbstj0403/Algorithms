import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            int N = Integer.parseInt(line.trim());
            int size = (int) Math.pow(3, N);
            char[] arr = new char[size];
            Arrays.fill(arr, '-');
            buildCantor(arr, 0, size);
            System.out.println(new String(arr));
        }
    }

    // arr[start ... start+len) 구간 중 가운데 구간을 비우고 재귀 호출
    private static void buildCantor(char[] arr, int start, int len) {
        if (len == 1) return;
        int third = len / 3;
        int midStart = start + third;
        int midEnd = midStart + third;
        for (int i = midStart; i < midEnd; i++) {
            arr[i] = ' ';
        }
        buildCantor(arr, start, third);
        buildCantor(arr, midEnd, third);
    }
}
