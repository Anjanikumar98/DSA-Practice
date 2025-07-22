public class a5 {

    public static int[] subarray(int arr[], int tar) {
        
        int n = arr.length;
        int sum = 0, start = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            while (sum > tar && start < i) {
                sum -= arr[start];
                start++;
            }

            if (sum == tar) {
                return new int[]{start + 1, i + 1};
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
    }
}

