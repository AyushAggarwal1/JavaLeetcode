// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
package A01Arrays;

public class A02buySellStocks {
    public static void main(String args[])
    {
        int [] prices = {7,1,5,3,6,4};
        int result = buySell(prices);

        System.out.print(result);
    }

    public static int buySell(int arr[])
    {
        int min_price = Integer.MAX_VALUE;
        int profit = 0;

        for(int i=0; i<arr.length; i++) 
        {
            min_price = Math.min(arr[i],min_price);
            profit = Math.max(profit, arr[i]-min_price);
        }

        return profit;
    }
}
