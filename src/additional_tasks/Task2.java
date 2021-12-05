package additional_tasks;

import java.util.Scanner;

//For each month, the bank charges 7% of the deposit amount to the deposit amount.
// Write a program in which the user enters the deposit amount and the number of months.
// And the bank calculates the final amount of the deposit, taking into account the interest accrued for each month.
//Use a for loop to calculate the amount including interest. Let the deposit amount represent float type.
public class Task2 {
    public static void main(String[] args) {
        System.out.println("Enter the deposit amount: ");
        Scanner scanner = new Scanner(System.in);
        float deposit = scanner.nextFloat();
        System.out.println("Enter the count of months: ");
        int month = scanner.nextInt();
        float percent = 0.0f;
        for (int i = 1; i <= month; i++) {
            percent = deposit * 0.07f;
            deposit += percent;
        }
        System.out.println("The sum of the deposit for " + month + "months is " + deposit);

    }
}
