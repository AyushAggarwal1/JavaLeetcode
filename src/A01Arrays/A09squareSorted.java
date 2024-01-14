package A01Arrays;
public class A09squareSorted {

    public int[] sortedSquares(int[] nums) 
    {
        if(nums.length ==1)
        {
            nums[0] = nums[0] * nums[0];
            return nums;
        }

        int arr[] = new int[nums.length];

        int i=0;
        int j=arr.length;
        int ptr=arr.length;

        while(i<nums.length && j>=0 && ptr>=0)
        {
            if(nums[i]*nums[i] > nums[j]*nums[j])
            {
                arr[ptr] = nums[i]*nums[i];
                i++;
                ptr++;
            }

            else
            {
                arr[ptr] = nums[j]*nums[j];
                j--;
                ptr++;
            }
        }

        return arr;
    }
}