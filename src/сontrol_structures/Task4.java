package сontrol_structures;

import java.util.Scanner;

//For the entered number t (outdoor temperature) output
//	If t>-5, output "Warm".
//	If -5>= t > -20, output "Normal".
//	If -20>= t, output "Cold".

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter the number of temperature: ");
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        if (t > -5) {
            System.out.println("Warm");
        } else if (t > -20) {
            System.out.println("Normal");
        } else {
            System.out.println("Cold");
        }
    }
}
