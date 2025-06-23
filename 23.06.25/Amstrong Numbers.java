public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int original = num;
        int result = 0;
        int n = String.valueOf(num).length();
        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }
        return result == original;
    }

    public static void main(String[] args) {
        int num = 153;
        System.out.println(num + " is an Armstrong number: " + isArmstrong(num));
    }
}
