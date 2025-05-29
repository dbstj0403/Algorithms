import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] numbers = br.readLine().split(" ");
        String A = numbers[0];
        String B = numbers[1];

        int[] result = reverse(A, B);
        int a = result[0];
        int b = result[1];

        int max = Math.max(a, b);

        System.out.println(max);

        br.close();
    }

    private static int[] reverse(String a, String b){
        int reverseA = 0;
        int reverseB = 0;

        String answer1 = "";

        for(int i = a.length() - 1; i >= 0; i--){
            char c = a.charAt(i);
            answer1 += c;

            if(i == 0){
                reverseA = Integer.parseInt(answer1);
            }
        }

        String answer2 = "";

        for(int i = b.length() - 1; i >= 0; i--){
            char c = b.charAt(i);
            answer2 += c;

            if(i == 0){
                reverseB = Integer.parseInt(answer2);
            }
        }

        return new int[] {reverseA, reverseB};
    }
}
