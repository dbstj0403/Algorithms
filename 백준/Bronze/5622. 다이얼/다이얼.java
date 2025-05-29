import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       int time = 0;
       String line = br.readLine();
       char[] chars = line.toCharArray();

       int idxArr[] = {2, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 7, 8, 8, 8, 9, 9, 9, 9};

       String str = "";

       for(char c : chars){
           int askii = (int) c;
           int idx = askii - 65;
           String part = String.valueOf(idxArr[idx]);
           str += part;
       }

       for(int i = 0; i < str.length(); i++){
           int sec = Character.getNumericValue(str.charAt(i));
           time += sec + 1;
       }

       System.out.println(time);
    }
}
