package additional_tasks;

//Write a program that displays the multiplication table on the console
public class Task3 {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 9; i++) {
            System.out.println("multiplication by " + i);
            for (int n = 1; n <= 9; n++) {
                result = i * n;
                System.out.println(i + " x " + n + " = " + result);
            }
            System.out.println("-------------");
        }
    }
}
