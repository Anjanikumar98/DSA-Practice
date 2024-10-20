public class a3 {
    
    public static void printReverse(int[] arr) {

        if(arr.length == 0) {
            System.err.println("Array is empty");
        }
        for(int i=arr.length; i>0; i--) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        
        int[] arr1 = {1,2,3,4,5};

        printReverse(arr1);
    }
}