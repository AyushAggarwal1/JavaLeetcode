// https://leetcode.com/problems/majority-element/description/
package A01Arrays;

import java.util.*;
public class A08majorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;

        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                count = 1;
                ele = nums[i];

            }

            else if (ele == nums[i]) {
                count++;
            }

            else {
                count--;
            }
        }

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == ele) {
                counter++;
            }
        }

        if (counter > (nums.length / 2)) {
            return ele;
        }

        return -1;
    }

	private static void majorityElementusingHashMap(int[] arr)
	{
		HashMap<Integer,Integer> map = new HashMap<Integer, Integer>();

		for(int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
					int count = map.get(arr[i]) +1;
					if (count > arr.length /2) {
						System.out.println(arr[i]);
						return;
					} else
						map.put(arr[i], count);

			}
			else
				map.put(arr[i],1);
			}
			System.out.println(" No Majority element Found");
	}
}


