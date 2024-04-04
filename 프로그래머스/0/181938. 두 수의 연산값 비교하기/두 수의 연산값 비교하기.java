class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        
        String sumit = a1 + b1 ;
        
        int sum = Integer.parseInt(sumit);
        
       
        int mul = 2 * a * b;
        
        
        
        
        
        if(sum < mul)
        {
            answer = mul;
        } 
        
        else if(sum > mul) {
            
            answer = sum;
        }
        
        else if(sum == mul) {
            
            answer = sum;
            
            
        }
        
        
        
        
        return answer;
    }
}