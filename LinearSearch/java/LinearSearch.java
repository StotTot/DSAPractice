package LinearSearch.java;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9, 4, 5};
        int target = 9;
        System.out.println("This program finds the target number and returns the index within the int array.\n");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " was found at index " + i);
                break;
            }
        }
    }
}