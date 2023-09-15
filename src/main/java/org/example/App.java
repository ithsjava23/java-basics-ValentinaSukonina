package org.example;

import java.util.Locale;
import java.util.Scanner;

public class App {
        /*-----------------*/

    public static void printMenu() {
        System.out.printf("Elpriser \n");
        System.out.printf("========\n");
        System.out.printf("1. Inmatning\n");
        System.out.printf("2. Min, Max och Medel\n");
        System.out.printf("3. Sortera\n");
        System.out.printf("4. Bästa Laddningstid (4h)\n");
        System.out.printf("e. Avsluta\n");
    }

    public static void main(String[] args) {
        Locale swedishLocale = new Locale("sw", "SE");
        Locale.setDefault(swedishLocale);

        String menu = """
                Elpriser
                ========
                1. Inmatning
                2. Min, Max och Medel
                3. Sortera
                4. Bästa Laddningstid (4h)
                e. Avsluta
                """;

        System.out.print(menu);

            // Create a scanner object for user input
            Scanner scanner = new Scanner(System.in);
            // Create a boolean variable to control the loop
            boolean running = true;
            while (running) {
                System.out.print("\nPlease choose the option from menu\n");
                // Get the user choice from menu
                String choice = scanner.nextLine();
                // Use a switch statement to execute corresponding method
                switch (choice) {
                    case "1":
                        // Perform the action for option 1
                        System.out.printf("You chose option 1\n");
                        break;
                    case "2":
                        // Perform the action for option 2
                        System.out.printf("You chose option 2\n");
                        break;
                    case "3":
                        // Perform the action for option 3
                        System.out.printf("You chose option 3\n");
                        break;
                    case "4":
                        // Perform the action for option 4
                        System.out.printf("You chose option 4\n");
                        break;
                    case "e":
                        // Exit the program
                        System.out.printf("Program is terminated\n");
                        running = false;
                        break;
                    case "E":
                        // Exit the program
                        System.out.printf("Program is terminated\n");
                        running = false;
                        break;
                    default:
                        // Invalid input
                        System.out.printf("Invalid input. Please, choose the option from menu\n");
                        break;
                }
            }
            // Close the scanner
            //scanner.close();


        /*-----------------*/
    }
}
