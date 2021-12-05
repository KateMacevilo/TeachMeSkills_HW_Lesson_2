package сontrol_structures;

//Program to output the name of a season by the number of the month.
//Use the if-else-if statement.

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        // while (true) {                                          //I used it to check all situations
        System.out.println("Enter the number of month: ");
        Scanner scanner = new Scanner(System.in);
        int numberMonth = scanner.nextInt();
        if ((numberMonth == 1) || (numberMonth == 2) || (numberMonth == 12)) {
            System.out.println("It's Winter");
        } else if ((numberMonth >= 3) && (numberMonth <= 5)) {
            System.out.println("It's Spring");
        } else if ((numberMonth >= 6) && (numberMonth <= 8)) {
            System.out.println("It's Summer");
        } else if ((numberMonth >= 9) && (numberMonth <= 11)) {
            System.out.println("It's Autumn");
        } else {
            System.out.println("You need to enter a number from 1 to 12");
        }
        //}
    }
}
