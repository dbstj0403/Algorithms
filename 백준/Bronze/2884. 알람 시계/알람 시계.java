import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int hour = sc.nextInt();
       int min = sc.nextInt();

       if(min - 45 >= 0){
           System.out.print(hour);
           System.out.print(" ");
           System.out.print(min - 45);
       }
       else{
           if(hour == 0){
               hour = 23;
               min = 60 - (45 - min);
               System.out.print(hour);
               System.out.print(" ");
               System.out.print(min);
           }
           else{
               hour -= 1;
               min = 60 - (45 - min);
               System.out.print(hour);
               System.out.print(" ");
               System.out.print(min);
           }
       }
    }
}