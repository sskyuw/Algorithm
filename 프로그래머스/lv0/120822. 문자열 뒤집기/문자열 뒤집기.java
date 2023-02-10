class Solution {
    public String solution(String my_string) {
        String answer = "";
        int array = my_string.length(); 

       
    for(int i=array-1;i>=0;i--)
        
    {
        answer += my_string.charAt(i);
    }
               
           
            
        
        
      
        
        
        
        return answer;
    }
}