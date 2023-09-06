// https://leetcode.com/problems/find-pivot-index/
package A01Arrays;

public class A07pivotElement {
    public static int pivot(int nums[])
    {
        // int ele;
        int lsum=0;
        int rsum=0;

        for(int i=0; i<nums.length; i++)
        {
            rsum = rsum+nums[i];
        }

        for(int j=0; j<nums.length; j++)
        {
            rsum = rsum-nums[j];

            if(rsum == lsum)
            {
                return j;
            }

            lsum = lsum+nums[j];
        }
        return -1;
    }

    public static void main(String[] args) {
        int nums[] = {1,7,3,6,5,6};
        int res = pivot(nums);
        System.out.println(res);
    }
}
