class Solution {
    public int solution(int num1, int num2) {
        
        int answer=0;
        
        if((0<num1&&num1<=100) || (0<num2&&num2<=100))
            //제한사항 
            
        {
        
             answer = num1/num2;
            
        
        }
        
        else
        {
            System.out.println("제한사항이 있습니다.");
        }
  
         return answer;
       
    }
}