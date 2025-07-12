package vvce;
import java.util.ArrayList;

public class Gold {
    public static void main(String[] args) {
        
        ArrayList<Integer> pricesList = new ArrayList<>();
      
        int[] pricesArray = {7, 1, 5, 3, 6, 4};
        //[12, 2, 1, 4, 3, 11, 6]
        //[7, 4, 9, 1, 3, 4, 2]
        Gold gold = new Gold();
        System.out.println("Max profit: " + gold.maxProfit(pricesArray) 
        + "%");
    }
    
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;
        
        int min_price = prices[0];
        int max_profit = 0;
        
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min_price) {
                min_price = prices[i];
            } else {
                int curr_profit = prices[i] - min_price;
                if (curr_profit > max_profit) {  // Fixed this condition
                    max_profit = curr_profit;
                }
            }
        }
        return max_profit;
    }
}