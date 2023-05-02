import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        float var = promptForFloat();
        System.out.println(var);
    }

    public static float promptForFloat() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean isValidInput = false;
        while (!isValidInput) {
            try {
                System.out.print("Enter a fractional number: ");
                String input = scanner.nextLine();
                number = Float.parseFloat(input);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a fractional number.");
            }
        }
        return number;
    }

}