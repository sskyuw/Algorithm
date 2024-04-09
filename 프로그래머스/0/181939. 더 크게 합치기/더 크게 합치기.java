class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        
        String ab = a1 + b1;
        String ba = b1 + a1;
        
        int a2 = Integer.parseInt(ab);
        int b2 = Integer.parseInt(ba);
        
        if(a2 > b2)
        {
            answer = a2;
        }
        
        else if(a2 < b2) 
        {
            answer = b2;
        }
        
        else if(a2 == b2)
        {
            answer = a2;
        }
        
        
        return answer;
    }
}