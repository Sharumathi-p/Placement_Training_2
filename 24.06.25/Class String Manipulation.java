public class StringManipulation {
    public static void main(String[] args) {
        String text = "Hello, World!";
        System.out.println("Length: " + text.length());
        System.out.println("Uppercase: " + text.toUpperCase());
        System.out.println("Replaced: " + text.replace("World", "Java"));
        System.out.println("Substring: " + text.substring(7, 12));
    }
}
