
// Not solved yet
public class PlusOne {
    public int[] plusOne(int[] digits) {

        int length = digits.length;

        if (digits[length - 1] < 9) {
            digits[length - 1] = digits[length - 1] + 1;
            return digits;
        } else {
            int[] dig = new int[digits.length + 1];
            for (int i = 0; i < digits.length; i++) {
                dig[i] = digits[i];
                dig[digits.length - 1] = 1;
                dig[dig.length - 1] = 0;
                return dig;
            }

        }

        return digits;
    }
}