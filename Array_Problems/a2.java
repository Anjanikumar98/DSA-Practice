// Maximum and minimum of an array using minimum number of comparisons

import java.util.Arrays;
import java.util.Scanner;

public class a2 {
    
    public static void main(String args[]) {
        
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("Enter the number of elements in java");
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            
            for(int i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            
            System.out.println("min: " + arr[0]);
            System.out.println("max: " + arr[arr.length-1]);
        }
    }
}

