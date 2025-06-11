import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      String str = br.readLine();
      String reversed = new StringBuilder(str).reverse().toString();

      if(str.equals(reversed)) {
          System.out.println(1);
      }
      else{
          System.out.println(0);
      }

    }
}
