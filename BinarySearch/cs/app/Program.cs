class BinarySearch
{
    static void Main()
    {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 72;
        int tail = 0;
        int head = arr.Length - 1;
        int mid = (tail + head) / 2;

        while (tail <= head)
        {
            if (arr[mid] < target) {
                tail = mid + 1;
                mid = (tail + head) / 2;
            }
            else if (arr[mid] > target) {
                head = mid - 1;
                mid = (tail + head) / 2;
            }
            else if (arr[mid] == target) {
                Console.WriteLine("Target found at index " + mid);
                break;
            }      
        }
    }
}