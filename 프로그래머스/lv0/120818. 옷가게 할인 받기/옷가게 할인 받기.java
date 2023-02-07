class Solution {
    public int solution(int  price) {
        
        double discount;
        int answer = 0;
        
        
        if((10<=price&&price<=1000000))
        {
        //가격 
        //10만원 사면 5%할인 , 30만원 사면 10%할인 50만원이면 20%
        if((price>=100000&&price<300000))
        {
            price *= 0.95;
           
            
        }
        
        if((price>=300000&&price<500000))
        {
             price *= 0.9;
                
        }
        
        if(price>=500000)
        {
            price *= 0.8;
              
        }
            
            
        }
        return price;
    }
}