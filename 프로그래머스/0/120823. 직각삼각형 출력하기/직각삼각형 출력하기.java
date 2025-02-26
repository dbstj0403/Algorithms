import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 높이와 너비가 n인 직각 이등변 삼각형 출력
        
        for(int i=1; i<=n; i++){
            for(int j=i; j>0; j--){
                String str = "";
                str += "*";
                System.out.print(str);
            }
            System.out.println("");
        }
    }
}