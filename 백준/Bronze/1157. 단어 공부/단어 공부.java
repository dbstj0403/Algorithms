import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      str = str.toLowerCase();

      int[] logs = new int[26];

      for(char c : str.toCharArray()){
          if(Character.isLetter(c)){
              logs[c - 'a']++;
          }
      }

      int maxCount = -1;
      char mostUsed = '?';

      boolean isDuplicate = false;
      for(int i = 0; i < logs.length; i++){
         if(logs[i] > maxCount){
             maxCount = logs[i];
             mostUsed = (char) ('a' + i);
             isDuplicate = false;
         }
         else if(logs[i] == maxCount){
             isDuplicate = true;
         }
      }

      String mostUsedStr = String.valueOf(mostUsed).toUpperCase();
      System.out.println(isDuplicate ? "?" : mostUsedStr);
    }
}
