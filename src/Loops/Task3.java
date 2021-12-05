package Loops;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

// Write a program where the user enters any positive integer number. And the program sums all numbers from 1 to the number entered by the user.
//Use the Scanner class to enter the number.
public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the positive integer number: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= numb; i++) {    //I decided that the number entered should be included in the sum
            sum += i;
        }
        System.out.println(sum);
    }
}
