import java.util.Scanner;

public class EmptyStringExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-empty string: ");
        String input = scanner.nextLine();
        
        try {
            if (input.isEmpty()) {
                throw new Exception("Blank strings should not be entered.");
            }
            System.out.println("You entered: " + input);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
