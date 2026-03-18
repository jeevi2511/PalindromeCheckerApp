public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        PalindromeStrategy strategy = new StackStrategy();

        System.out.println("Input : " + input);
        System.out.println("Using Stack Strategy - Is Palindrome? : " + strategy.check(input));

        strategy = new DequeStrategy();
        System.out.println("Using Deque Strategy - Is Palindrome? : " + strategy.check(input));
    }
}