import java.util.Scanner;

public class MenuDrivenProgram {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Displays the menu options to the user.
     */
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Greet User");
        System.out.println("2. Check Even/Odd");
        System.out.println("3. Exit");
    }

    /**
     * Handles the user's menu choice and executes corresponding action.
     * @param choice the user's menu selection
     * @return boolean indicating whether to continue the program
     */
    public static boolean handleMenuChoice(int choice) {
        switch (choice) {
            case 1:
                greetUser();
                return true;
            case 2:
                checkEvenOrOdd();
                return true;
            case 3:
                System.out.println("Exiting program. Goodbye!");
                return false;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                return true;
        }
    }

    /**
     * Displays a greeting message to the user.
     */
    public static void greetUser() {
        System.out.println("Hello! Welcome!");
    }

    /**
     * Gets an integer input from user and checks if it's even or odd.
     */
    public static void checkEvenOrOdd() {
        System.out.print("Enter an integer: ");
        try {
            int number = Integer.parseInt(scanner.nextLine());
            if (number % 2 == 0) {
                System.out.println(number + " is an Even number.");
            } else {
                System.out.println(number + " is an Odd number.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
    }

    /**
     * Gets a valid menu choice from the user.
     * @return the user's validated choice
     */
    public static int getMenuChoice() {
        while (true) {
            System.out.print("Enter your choice (1-3): ");
            try {
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice >= 1 && choice <= 3) {
                    return choice;
                } else {
                    System.out.println("Please enter a number between 1 and 3.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number.");
            }
        }
    }

    public static void main(String[] args) {
        boolean continueProgram = true;

        while (continueProgram) {
            displayMenu();
            int choice = getMenuChoice();
            continueProgram = handleMenuChoice(choice);
        }

        scanner.close();
    }
}

