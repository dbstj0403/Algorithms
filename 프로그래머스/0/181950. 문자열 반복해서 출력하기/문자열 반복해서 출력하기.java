import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        
        String strForConcat = str;
        
        for (int i=0; i<n-1; i++){
              str += strForConcat;
        }
        
        System.out.println(str);
      
    }
}