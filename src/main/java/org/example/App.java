package org.example;

import java.util.Locale;
import java.util.Scanner;

public class App {
        /*-----------------*/
    public static void main(String[] args) {
        Locale swedishLocale = new Locale("sw", "SE");
        Locale.setDefault(swedishLocale);

        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);
        String choice;
        do {
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
            choice = scanner.nextLine();
            if(choice.equals("1")){
                System.out.print("You chose option 1\n");
                    break;
            }
            else if(choice.equals("2")){System.out.print("You chose option 2\n");}
            else if(choice.equals("3")){System.out.print("You chose option 3\n");}
            else if(choice.equals("4")){System.out.print("You chose option 4\n");}
        }while(!choice.equalsIgnoreCase("e"));
//        // Use a switch statement to execute corresponding method
//        //Code for choices 1-4
//            switch (choice) {
//                case "1":
//                    // Perform the action for option 1
//                    System.out.print("You chose option 1\n");
//                    break;
//                case "2":
//                    // Perform the action for option 2
//                    System.out.print("You chose option 2\n");
//                    break;
//                case "3":
//                    // Perform the action for option 3
//                    System.out.print("You chose option 3\n");
//                    break;
//                case "4":
//                    // Perform the action for option 4
//                    System.out.print("You chose option 4\n");
//                    break;
//        } while(!choice.equalsIgnoreCase("e")) {
//                ;
//            }

        /*-----------------*/
    }
}
