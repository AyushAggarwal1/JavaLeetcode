// https://leetcode.com/problems/two-sum/
package A01Arrays;

import java.util.*;

public class A01twoSum {
    public static void main(String args[])
    {   
        int arr[] = {2,7,11,15};
        int target = 9;

        int result[] = twosum(arr, target);

        System.out.print(result[0]+" " +result[1]);
    }

    // tc n^2
    public static int[] twosum(int arr[], int target)
    {
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]+arr[j] == target)
                {
                    return new int[]{i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }

    // tc n
    // find complement -> target - i -> find y -> using hashmap

    public static int[] twosum2(int arr[], int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            int comp = target - arr[i];

            if(map.containsKey(comp))
            {
                return new int[]{map.get(comp), i};
            }

            map.put(arr[i], i);
        }

        return new int[-1];
    }
}
