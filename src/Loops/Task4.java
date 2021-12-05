package Loops;

//You want the program to display the following sequence:
// 7 14 21 28 35 42 49 56 63 70 77 84 91 98.
//Use the while loop in the solution.
public class Task4 {
    public static void main(String[] args) {
        int i = 7;
        int seq = 0;
        while (seq < 98) {
            seq += i;
            System.out.println(seq);
        }

    }
}
