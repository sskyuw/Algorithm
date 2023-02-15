class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
    
        
        //배수의 글자만 진짜 암호 
        for(int i=0;i<cipher.length();i++)
        {
           if(i%code == code-1)
           {
               answer += cipher.charAt(i);
           }
        }
        
        return answer;
    }
}