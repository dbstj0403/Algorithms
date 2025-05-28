import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int hour = sc.nextInt();
       int min = sc.nextInt();
       int time = sc.nextInt();

       int timeToHour = time / 60;
       int timeToMin = time % 60;

       hour = hour + timeToHour;
       min = min + timeToMin;

       if(min >= 60){
           int plus = min - 60;
           hour++;
           if(hour >= 24){
               hour = hour - 24;
           }
           System.out.println(hour + " " + plus);
       }
       else{
           if(hour >= 24){
               hour = hour - 24;
           }
           System.out.println(hour + " " + min);
       }

    }
}