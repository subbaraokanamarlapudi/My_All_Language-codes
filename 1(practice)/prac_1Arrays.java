import java.util.*;
//Buy and sell stocks
public class prac_1Arrays {
    public static int BASstocks(int prices[] ){
        int buy_price=Integer.MAX_VALUE;
        int max_profit=0;
        for(int i=0;i<prices.length;i++){
            if(buy_price<prices[i]){// if BP(7) < SP (9)  = 2 rs profit
                 int profit=prices[i]-buy_price;
                 max_profit=Math.max(profit,max_profit);

            }
            else{
                buy_price=prices[i];// bp(9)>sp(7)= 2rs loss
            }
        }
        return max_profit;
    }
    

    public static void main(String args[]){
        int prices[]= {7,1,5,3,6,4};
       System.out.println("BUY AND SELL STOCK MAX_PROFIT:"+ BASstocks(prices));
        
      
   }
}
    

