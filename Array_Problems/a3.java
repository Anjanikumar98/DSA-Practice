public class a3 {
    
    public static void printReverse(int[] arr) {

        if(arr.length == 0) {
            System.err.println("Array is empty");
            return;
        }
        for(int i=arr.length-1; i>=0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4};

        printReverse(arr1);
    }
}