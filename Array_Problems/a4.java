import java.util.Scanner;
public class a4 {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.err.println("Enter the numbers of rows");
        int rows = sc.nextInt();

        System.err.println("Enter the numbers of columns");
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                numbers[i][j] = sc.nextInt();
                sc.close();
            }
        }
        
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.err.print( numbers[i][j] + " ");
            }
            System.err.println(" ");
        }
    }
}
