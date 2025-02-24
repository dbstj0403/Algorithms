import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        StringBuilder newStr = new StringBuilder();
        
        for(int i=0; i<a.length(); i++){
            char c = a.charAt(i);
            if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
                newStr.append(c);
            }
            else {
                c = Character.toLowerCase(c);
                newStr.append(c);
            }
        }
        
        System.out.println(newStr);
    }
}