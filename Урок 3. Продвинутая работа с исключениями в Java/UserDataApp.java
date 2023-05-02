import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserDataApp {


    // example of data entry
    // Date of Birth Gender Phone Number Surname First Name Father's Name
    //12.03.1985 m 5551234567 Smith John William
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for data
        System.out.println("Enter user data (in random order, separated by a space):");
        String data = scanner.nextLine();

        // Split data into array of strings
        String[] dataArray = data.split(" ");

        // Check if enough data was entered
        if (dataArray.length < 6) {
            System.out.println("Not enough data entered.");
            return;
        } else if (dataArray.length > 6) {
            System.out.println("Too much data entered.");
            return;
        }

        String surname = "";
        String firstName = "";
        String fathersName = "";
        String dateOfBirth = "";
        String phoneNumber = "";
        String gender = "";

        // Extract data from array
        for (String item : dataArray) {
            if (item.matches("[a-zA-Z]+")) {
                if (surname.equals("")) {
                    surname = item;
                } else if (firstName.equals("")) {
                    firstName = item;
                } else {
                    fathersName = item;
                }
            } else if (item.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                dateOfBirth = item;
            } else if (item.matches("\\d+")) {
                phoneNumber = item;
            } else if (item.matches("[fmFM]")) {
                gender = item;
            } else {
                System.out.println("Invalid data entered.");
                return;
            }
        }

        // Create user object
        User user = new User(surname, firstName, fathersName, dateOfBirth, phoneNumber, gender);

        // Write data to file
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(surname + ".txt"));
            writer.write(user.toString());
            writer.close();
            System.out.println("Data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static class User {
        private String surname;
        private String firstName;
        private String fathersName;
        private String dateOfBirth;
        private String phoneNumber;
        private String gender;

        public User(String surname, String firstName, String fathersName, String dateOfBirth, String phoneNumber, String gender) {
            this.surname = surname;
            this.firstName = firstName;
            this.fathersName = fathersName;
            this.dateOfBirth = dateOfBirth;
            this.phoneNumber = phoneNumber;
            this.gender = gender;
        }

        public String toString() {
            return surname + " " + firstName + " " + fathersName + " " + dateOfBirth + " " + phoneNumber + " " + gender;
        }
    }
}

