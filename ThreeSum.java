import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = { -100, -70, -60, 110, 120, 130, 160 };
        List<List<Integer>> list = new ArrayList<List<Integer>>();

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                System.out.println("sum::" + (nums[i] + nums[left] + nums[right]));
                if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                    continue;
                } else if (nums[i] + nums[left] + nums[right] < 0) {
                    left++;
                    continue;
                } else if (nums[i] + nums[left] + nums[right] == 0) {
                    list.add(List.of(nums[i], nums[left], nums[right]));
                }
                left++;
                right--;
            }
        }

        System.out.println(list);

    }
}
