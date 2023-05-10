import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 32, 6, 0, 29};
        int n = arr.length;
        boolean swapped = false;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;  
                    swapped = true;
                }
            }

            if (swapped == false)
                break;
        }

        System.out.println(Arrays.toString(arr));
    }
}
