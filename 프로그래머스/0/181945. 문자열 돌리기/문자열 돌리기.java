import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        char[] b = a.toCharArray();
        
        for(int i = 0; i < b.length; i++)
        {
            System.out.println(b[i]);
        }
    }
}