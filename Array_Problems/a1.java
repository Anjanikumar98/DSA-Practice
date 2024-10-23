import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input size of the array
            System.out.println("Enter the number of elements: ");
            int size = sc.nextInt();
            int[] marks = new int[size];

            // Input elements into the array
            System.out.println("Enter " + size + " elements:");
            for (int i = 0; i < size; i++) {
                marks[i] = sc.nextInt();
            }

            // Input the number to search
            System.out.println("Enter the number to search: ");
            int x = sc.nextInt();

            // Search for the number and print its index if found
            boolean found = false;
            for (int i = 0; i < marks.length; i++) {
                if (x == marks[i]) {
                    System.out.println("Number found at index: " + i);
                    found = true;
                    break; // Exit the loop when found
                }
            }
            if (!found) {
                System.out.println("Number not found");
            }
        }
    }
}
