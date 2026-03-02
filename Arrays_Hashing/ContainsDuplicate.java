package Arrays_Hashing;

/*
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
Example 1:
Input: nums = [1,2,3,1]
Output: true
Explanation:
The element 1 occurs at the indices 0 and 3.

Example 2:
Input: nums = [1,2,3,4]
Output: false
Explanation:
All elements are distinct.

Example 3:
Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true
Constraints:
1 <= nums.length <= 105
-109 <= nums[i] <= 109 */

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4 };
        // solution1
        boolean result;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                result = true;
            }
        }
        result = false;
        System.out.println("Answer::" + result);

        // solution 2 :: using set
        nums = new int[] { 1, 2, 3, 1 };
        var set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }

        System.out.println("Answer::" + (set.size() != nums.length));
        set.clear();

        // solution 3:: using hashset and optimization
        nums = new int[] { 10, 20, 26, 24, 1 };
        for (int i : nums) {
            if (!set.add(i)) {
                System.out.println("Answer::" + true);
                return;
            }
        }
        System.out.println("Answer::" + false);

    }
}
