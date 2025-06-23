public class BinaryToDecimal {
    public static int binaryToDecimal(String binary) {
        int decimal = 0;
        int base = 1;
        for (int i = binary.length() - 1; i >= 0; i--) {
            if (binary.charAt(i) == '1') {
                decimal += base;
            }
            base *= 2;
        }
        return decimal;
    }

    public static void main(String[] args) {
        String binary = "1010";
        System.out.println("The decimal of binary " + binary + " is " + binaryToDecimal(binary));
    }
}
