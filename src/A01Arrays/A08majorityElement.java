// https://leetcode.com/problems/majority-element/description/
package A01Arrays;

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

}
