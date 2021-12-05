package сontrol_structures;

//A program that will take a number as input and output a message saying whether the number is even or not.
//To determine whether a number is even, use the operation to get the remainder of the division -
//the operation looks like this: '% 2')


import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        if (numb % 2 == 0) {
            System.out.println("Is an even number");
        } else {
            System.out.println("Is an odd number");
        }
    }
}
