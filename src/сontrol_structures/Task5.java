package сontrol_structures;

import java.util.Scanner;

//Using the number you entered, determine the color of the rainbow
//(1 is red, 4 - green, etc.)
public class Task5 {
    public static void main(String[] args) {
        System.out.println("Enter the number from 1 to 7: ");
        Scanner scanner = new Scanner(System.in);
        int numbRainbow = scanner.nextInt();
        switch (numbRainbow) {
            case 1:
                System.out.println("Red");
                break;
            case 2:
                System.out.println("Orange");
                break;
            case 3:
                System.out.println("Yellow");
                break;
            case 4:
                System.out.println("Green");
                break;
            case 5:
                System.out.println("Light blue");
                break;
            case 6:
                System.out.println("Blue");
                break;
            case 7:
                System.out.println("Purple");
                break;

        }
    }
}
