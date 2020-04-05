import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] set = new int[2];
        HashMap<Integer, Integer> numSet = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!numSet.containsKey(nums[i])) {
                numSet.put(nums[i], i);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (numSet.containsKey(target - nums[i]) && numSet.get(target - nums[i]) != i) {
                set[0] = i;
                set[1] = numSet.get(target - nums[i]);
                break;
            }
        }

        return set;
    }
}