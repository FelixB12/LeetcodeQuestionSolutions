
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int numZero = 0;
        int size = nums.length;
        boolean zeroFound = false;

        for (int i = 0; i < size; i++) {
            if (nums[i] == 0) {
                numZero++;
            }
        }

        for (int i = 0; i < numZero; i++) {
            for (int k = 0; k < size; k++) {
                if (zeroFound) {
                    swapInts(nums, k, k + 1);
                }

                if (nums[k] == 0 && !zeroFound) {
                    zeroFound = true;
                    swapInts(nums, k, k + 1);
                }
            }
            zeroFound = false;
        }
    }

    void swapInts(int[] nums, int i, int j) {
        int temp;
        if (i < nums.length && j < nums.length) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}