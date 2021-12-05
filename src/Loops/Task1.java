package Loops;

//Use the for loop to display odd numbers from 1 to 99.
//Use the increment operation (++) when solving.
public class Task1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
