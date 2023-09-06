package A01Arrays;

public class A04moveZeros 
{
    public static void move0(int arr[])
    {
        int i=0;
        for(int j=0; j<arr.length; j++)
        {
            if(arr[j] != 0)
            {
                arr[i] = arr[j];
                i++;
            }
        }

        while(i < arr.length)
        {
            arr[i] = 0;
            i++;
        }
    }

    public static void main(String[] args) {
        int nums[] = {0,1,0,3,12};
        move0(nums);
        for (int i=0; i<nums.length; i++) 
        {
            System.out.print(nums[i]+" ");
        }
    }
}
