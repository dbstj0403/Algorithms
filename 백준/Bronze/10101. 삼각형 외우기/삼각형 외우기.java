import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] arr = new int[3];

        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine());
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sum = arr[0] + arr[1] + arr[2];

        if(arr[0] == 60 && arr[1] == 60 && arr[2] == 60){
            System.out.println("Equilateral");
        }
        else if((sum == 180) && (arr[0] == arr[1] || arr[0] == arr[2] || arr[1] == arr[2])){
            System.out.println("Isosceles");
        }
        else if((sum == 180) && (arr[0] != arr[1] && arr[1] != arr[2] && arr[0] != arr[2])){
            System.out.println("Scalene");
        }
        else if(sum != 180){
            System.out.println("Error");
        }
    }
}
