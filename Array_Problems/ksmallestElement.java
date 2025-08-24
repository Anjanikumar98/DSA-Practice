public class ksmallestElement {
    
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i]; arr[i] = arr[high]; arr[high] = temp;
        return i;
    }

    public static int kthSmallest(int[] arr, int k) {
        int low = 0, high = arr.length - 1;
        k = k - 1;
        while (low <= high) {
            int pi = partition(arr, low, high);
            if (pi == k) return arr[pi];
            else if (pi < k) low = pi + 1;
            else high = pi - 1;
        }
        return -1;
    }

    public static int[] subarray(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum == target) return new int[]{i, i};
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == target) return new int[]{i, j};
            }
        }

        return new int[]{-1};
    }

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int tar = 15;

        int[] res = subarray(arr, tar);
        if (res.length == 2) {
            System.out.println(res[0] + " " + res[1]);
        } else {
            System.out.println(res[0]);
        }

        int[] arr2 = {7, 10, 4, 3, 20, 15};
        int k = 3;
        System.out.println("Kth smallest: " + kthSmallest(arr2, k));
    }
}
