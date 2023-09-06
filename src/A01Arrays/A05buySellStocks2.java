// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/
package A01Arrays;
public class A05buySellStocks2 
{
    public static int maxPro(int nums[])
    {
        int profit =0;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i] > nums[i-1])
            {
                profit = profit + (nums[i] - nums[i-1]);
            }
        }

        return profit;
    }
    public static void main(String[] args) {
        int nums[] = {7,1,5,3,6,4};
        int result = maxPro(nums);
        System.out.println(result);        
    }   
}
