import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char[] b = a.toCharArray();
        
        
        for(int i= 0; i < b.length; i++)
        {
          
            if(b[i] == Character.toUpperCase(b[i]))
            {
                b[i] = Character.toLowerCase(b[i]);
            }
            
            else if(b[i] == Character.toLowerCase(b[i]))
            {
                b[i] = Character.toUpperCase(b[i]);
            }
            
            System.out.print(b[i]);
            
            
        }
            
            
    }
}