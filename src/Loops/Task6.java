package Loops;

//Make a program that displays the squares of numbers from 10 to 20 inclusive
public class Task6 {
    public static void main(String[] args) {
        int square = 0;
        for (int i = 10; i <= 20; i++) {
            square = i * i;
            System.out.println(square);
        }
    }
}
