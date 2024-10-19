
import java.util.Scanner;
public class a1 {

public static void main(String arg[]) {

    try (Scanner sc = new Scanner(System.in)) {
            int size = sc.nextInt();

            int[] marks = new int[size];

            for(int i=0; i<size; i++) {
                marks[i] = sc.nextInt();
            }

            System.out.println("Enter the number to search: ");
            int x = sc.nextInt();

            for(int i=0; i<marks.length; i++) {
                if(x == marks[i]) {
                    System.err.println(i);
                }
            }
        }
    }
}