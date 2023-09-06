// https://leetcode.com/problems/find-pivot-index/
package A01Arrays;

public class A06runningSum 
{
    public static int[] runSum(int nums[])
    {
        int sum = 0;
        for(int i=0; i<nums.length; i++)
        {
            sum = sum + nums[i];
            nums[i] = sum;
        }
        return nums;
    }   
    
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        
        nums = runSum(nums);

        for (int i=0; i<nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}
