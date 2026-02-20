import java.util.Scanner;

public class ReverseStringTask {

    public static String reverseString(String text) {
        StringBuilder reversed = new StringBuilder();

        for (int i = text.length() - 1; i >= 0; i--) {
            reversed.append(text.charAt(i));
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        // our own method!
        String manual = reverseString(input);

        // built-in method!
        String builtin = new StringBuilder(input).reverse().toString();

        System.out.println("Manual reverse: " + manual);
        System.out.println("Built-in reverse: " + builtin);

        // comparison
        if (manual.equals(builtin)) {
            System.out.println("Both methods give same result.");
        } else {
            System.out.println("Results are different.");
        }
        
        sc.close();
    }
}
