import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int[] arr = new int[N];

       for(int i = 1; i <= N; i++) {
           arr[i -1] = sc.nextInt();
       }

       int search = sc.nextInt();

       int count = 0;
       for(int i = 0; i < arr.length; i++){
           if(arr[i] == search){
               count++;
           }
       }
       
       System.out.println(count);
    }
}