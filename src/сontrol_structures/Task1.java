package сontrol_structures;

//A program to output the name of a season by the number of the month.
//	Use the switch-case operator when solving this problem.

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        System.out.println("Enter the month number: ");
        Scanner scanner = new Scanner(System.in);
        String month = scanner.next();
        switch (month) {
            case "1":
            case "2":
            case "12":
                System.out.println("It's winter");
                break;
            case "3":
            case "4":
            case "5":
                System.out.println("It's Spring");
                break;
            case "6":
            case "7":
            case "8":
                System.out.println("It's summer");
                break;
            case "9":
            case "10":
            case "11":
                System.out.println("It's autumn");
                break;
            default:
                System.out.println("You need to enter a number from 1 to 12");
        }
    }
}

