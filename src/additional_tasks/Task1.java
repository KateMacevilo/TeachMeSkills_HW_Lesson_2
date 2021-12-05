package additional_tasks;

//Display the first 11 members of the Fibonacci sequence
public class Task1 {
    public static void main(String[] args) {
        int first = 0;
        int last = 1;
        System.out.println(first);
        System.out.println(last);
        int prevLast = 0;
        for (int i = 1; i < 10; i++) {
            prevLast = last;
            last += first;
            first = prevLast;
            System.out.println(last);
        }
    }
}
