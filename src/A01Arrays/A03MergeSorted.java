//https://leetcode.com/problems/merge-sorted-array/
package A01Arrays;

public class A03MergeSorted {
    public static void merge(int arr1[], int n, int arr2[], int m)
    {
        int i=n-1; 
        int j=m-1;
        int k = (n+m) - 1;
        
        while(i>=0 && j>=0)
        {
            if(arr1[i] > arr2[j])
            {
                arr1[k] = arr1[i];
                i--;
                k--;
            }

            else
            {
                arr1[k] = arr2[j];
                j--;
                k--;
            }
        }

        while(i>=0)
        {
            arr1[k] = arr1[i];
            k--;
            i--;
        }

        while(j>=0)
        {
            arr1[k] = arr2[j];
            k--;
            j--;
        }
    }

    public static void main(String[] args) {
        int [] nums1 = {1,2,3,0,0,0};
        int m = 3;

        int [] nums2 = {2,5,6};
        int n = 3;
        
        merge(nums1, n, nums2, m);

        for(int i=0; i<nums1.length;i++)
        {
            System.out.println(nums1[i]);
        }
    }
}
