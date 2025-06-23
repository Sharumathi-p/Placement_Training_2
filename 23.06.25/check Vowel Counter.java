public class VowelCounter {
    public static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println("Number of vowels in \"" + str + "\": " + countVowels(str));
    }
}
