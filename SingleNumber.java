import java.util.HashMap;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        HashMap<Integer, Integer> numSet = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numSet.containsKey(nums[i])) {
                numSet.put(nums[i], 1);
            } else {
                numSet.replace(nums[i], numSet.get(nums[i]) + 1);
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (numSet.get(nums[i]) % 2 != 0) {
                single = nums[i];
                break;
            }
        }

        return single;
    }
}