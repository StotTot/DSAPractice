class LinearSearch
{
    static void Main()
    {
        int[] arr = {1, 2, 3, 9, 4, 5};
        int target = 9;
        for (int i = 0; i < arr.Length; i++)
        {
            if (arr[i] == target)
            {
                Console.WriteLine("Found target at index " + i);
                break;
            }
        }
    }
}