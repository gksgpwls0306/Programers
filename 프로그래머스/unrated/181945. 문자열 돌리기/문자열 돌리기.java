import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int len = a.length();
        for(int i=0; i<len;i++){
            System.out.println(a.charAt(i));
        }
    }
}