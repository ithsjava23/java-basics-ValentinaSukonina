package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
        /*-----------------*/
        public static void main(String[] args) {
            /*Locale swedishLocale = new Locale("sw", "SE");
            Locale.setDefault(swedishLocale);*/
            Locale.setDefault(new Locale("sv", "SE"));

            // Create a scanner object for user input and 2 empty arrays
            Scanner scanner = new Scanner(System.in);
            int[] price = new int[24]; // array for price input
            int[] hours = new int[24]; // array for hours (as index for price input
            String[] timeTable = new String[24]; //array for formatted time
            int[][] pricePerHour = new int[24][2]; //2D array with prices and hours as index
            float mean4h = 0;
            int minPrice = 0;
            int positionMin = 0;
            int maxPrice = 0;
            int positionMax = 0;
            double meanPrice = 0;
            double min4h;
            int mean4Start = 0;

            // fill array for hours and array for timeTable with formatted hours string
            for (int i = 0; i < hours.length; i++) {
                hours[i] = i;
                timeTable[i] = String.format("%02d-%02d", i, i + 1);
            }

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
                    if (choice.equals("1")) {
                        for (int i = 0; i < price.length; i++) {
                            System.out.print(timeTable[i] + " ");
                            price[i] = Integer.parseInt(scanner.nextLine());
                        }
//                        try {
//                            price[i] = Integer.parseInt(scanner.nextLine());
//                        } catch (Exception e) {
//                            System.out.print("Invalid input. Only whole numbers, please\n");
//                            i -= 1;
//                        }

                    // Create a new 2D array that contains both prices and hours
                    for (int i = 0; i < pricePerHour.length; i++) {
                        pricePerHour[i][0] = hours[i]; //assign the element of array hour to the 1st column
                        pricePerHour[i][1] = price[i]; //assign the element of array price to the 2nd column
                    }
                }

                    if (choice.equals("2")) {
                        for (int i = 0; i < pricePerHour.length; i++) {
                            if (i == 0) {
                                minPrice = pricePerHour[i][0];
                                positionMin = i;
                                minPrice = pricePerHour[i][0];
                            }
                            if (pricePerHour[i][0] > maxPrice) {
                                maxPrice = pricePerHour[i][0];
                                positionMax = i;
                            }
                            if (pricePerHour[i][0] < minPrice) {
                                minPrice = pricePerHour[i][0];
                                positionMin = i;
                            }
                            meanPrice = meanPrice + pricePerHour[i][0];
                        }
                        meanPrice = meanPrice / 24;

                        System.out.print("Lägsta pris: " + timeTable[positionMin] + ", " + minPrice + " öre/kWh\n");
                        System.out.print("Högsta pris: " + timeTable[positionMax] + ", " + maxPrice + " öre/kWh\n");
                        System.out.print("Medelpris: " + String.format("%.02f", meanPrice) + " öre/kWh\n");
                    }
                    if (choice.equals("3")) {
                        // Make a copy of the original array with Price in first column, hours in second*/
                        int[][] copyPricePerHour = Arrays.copyOf(pricePerHour, pricePerHour.length);
                        // Sort the copy of Array by the first column using a lambda expression
                        Arrays.sort(copyPricePerHour, (int[] a, int[] b) -> Integer.compare(a[0], b[0]));
                        int hour;
                        for (int i = 0; i < copyPricePerHour.length; i++) {
                            hour = pricePerHour[i][1];
                            System.out.printf(String.format("%02d-%02d", hour, hour + 1) + " " + copyPricePerHour[i][0] + " öre\n");
                        }
                    }
                    if (choice.equals("4")) {
                        System.out.print("You chose option 4\n");
                    }

            }while (!choice.equalsIgnoreCase("e"));
        }
        }
/*-----------------*/
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



