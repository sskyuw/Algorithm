class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        //문자를 반복할 수 만큼 반복 
        for(int i=0; i<my_string.length(); i++)
        {
           //answer = my_string.charAt(i)*n;
           
            for(int y=0; y<n; y++)
            {
                 answer = answer+my_string.charAt(i);
            }
            
        }
        
        return answer;
    }
}