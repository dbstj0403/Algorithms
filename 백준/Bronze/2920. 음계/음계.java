import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String[] notes = new String[8];

        for(int i = 0; i < 8; i++) {
            String note = st.nextToken();
            notes[i] = note;
        }

        StringBuilder sb = new StringBuilder();

        for(String note : notes) {
            sb.append(note);
        }
        
        if(sb.toString().equals("12345678")) System.out.println("ascending");
        else if(sb.toString().equals("87654321")) System.out.println("descending");
        else System.out.println("mixed");
    }
}
