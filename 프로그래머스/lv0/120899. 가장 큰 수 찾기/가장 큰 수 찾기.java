class Solution {
    public int[] solution(int[] array) {
        int[] answer = {};
        
        int max =0;
        int indx =0;
        
        for(int i=0; i<array.length;i++)
        {
            for(int y=1;y<array.length;y++)
            {
                if(array[y]>array[i])
                {
                    max = array[y];
                    indx = y;
                    
                }
                
                
            }
            
            answer = new int[]{max,indx};
        }
        
        return answer;
    }
}