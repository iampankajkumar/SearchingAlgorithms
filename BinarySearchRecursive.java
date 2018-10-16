public class BinarySearchRecursive {
    public static void main(String[] args) {

        int arr[] = { 10, 12, 14, 16, 18, 20 };
        int size = arr.length;
        int search = 16;
        System.out.println(binarySearch(arr, 0, size - 1, search));
    }

    public static int binarySearch(int arr[], int low, int high, int search) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (search == arr[mid])
            return mid;
        else if (search < arr[mid])
            return binarySearch(arr, low, mid - 1, search);
        else
            return binarySearch(arr, mid + 1, high, search);
    }
}