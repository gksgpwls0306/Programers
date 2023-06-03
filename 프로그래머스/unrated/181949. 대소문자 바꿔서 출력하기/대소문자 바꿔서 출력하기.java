import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char b;
        for(int i=0; i<a.length();i++){
            b=a.charAt(i);
            if(Character.isUpperCase(b) ==true){
                System.out.print(Character.toLowerCase(b));
            } else {
                System.out.print(Character.toUpperCase(b));  
            }
        }
        
    }
}