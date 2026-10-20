package Array.Date_20_Oct;

public class BestTimeToBuyAndSell_121 {
        public static int maxProfit(int[] prices) {
            int n= prices.length;
            int max_profit=0;
            int buy_price=prices[0];
            for(int i=1;i<n;i++){
                int curr_profit=prices[i]-buy_price;
                if(curr_profit>max_profit){
                    max_profit=curr_profit;
                }
                if(prices[i]<buy_price){
                    buy_price=prices[i];
                }


            }
            return max_profit;

        }

    public static void main(String[] args) {
        int[]prices={7,1,3,5,6,2};
        System.out.println(maxProfit(prices));
    }
    }

    //Time Complexity = O(N)
    //Space Complexity = O(1)

