package org.example;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class App {
        /*-----------------*/
        public static void main(String[] args) {
            Locale.setDefault(new Locale("sv", "SE"));

            // Create a scanner object for user input and 2 empty arrays
            Scanner scanner = new Scanner(System.in);
            String[] timeTable = new String[24]; //array for formatted time
            int[][] pricePerHour = new int[24][2]; //2D array with prices and hours as index
            int hour;
            int minPrice = 0;
            int positionMin = 0;
            int maxPrice = 0;
            int positionMax = 0;
            double meanPrice = 0;


            // fill "pricePerHour" array with hours and array for timeTable with formatted hours string
            for (int i = 0; i < 24; i++) {
                timeTable[i] = String.format("%02d-%02d", i, i + 1);
                pricePerHour[i][1] = i;
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
                       for (int i = 0; i < pricePerHour.length; i++) {
                            System.out.print(timeTable[i] + " ");
                            pricePerHour[i][0] = Integer.parseInt(scanner.nextLine());
                       }
                }
                    if (choice.equals("2")) {
                        for (int i = 0; i < pricePerHour.length; i++) {
                            if (i == 0) {
                                minPrice = pricePerHour[i][0];
                                positionMin = i;
                                maxPrice = pricePerHour[i][0];
                                positionMax = i;
                            }
                            if (pricePerHour[i][0] < minPrice) {
                                minPrice = pricePerHour[i][0];
                                positionMin = i;
                            }
                            if (pricePerHour[i][0] > maxPrice) {
                                maxPrice = pricePerHour[i][0];
                                positionMax = i;
                            }
                            //meanPrice = meanPrice + pricePerHour[i][0];
                            meanPrice += pricePerHour[i][0];
                        }
                        meanPrice = meanPrice / 24;

                        System.out.print("Lägsta pris: " + timeTable[positionMin] + ", " + minPrice + " öre/kWh\n");
                        System.out.print("Högsta pris: " + timeTable[positionMax] + ", " + maxPrice + " öre/kWh\n");
                        System.out.print("Medelpris: " + String.format("%.02f", meanPrice) + " öre/kWh\n");
                    }
                    if (choice.equals("3")) {
                        // Make a copy of the original 2d array "PricePerHour"
                        int[][] copyPricePerHour = Arrays.copyOf(pricePerHour, pricePerHour.length);

                        // Sort the copy of Array by the first column using a lambda expression
                        Arrays.sort(copyPricePerHour, (int[] a, int[] b) -> Integer.compare(b[0], a[0]));
                        for (int i = 0; i < copyPricePerHour.length; i++) {
                            hour = copyPricePerHour[i][1];
                            System.out.print(timeTable[hour] + " " + copyPricePerHour[i][0] + " öre\n");
                        }
                    }
                    if (choice.equals("4")) {
                        // Find 4 continuous hours with cheapest total price of electricity
}
            }while (!choice.equalsIgnoreCase("e"));
        }
}
