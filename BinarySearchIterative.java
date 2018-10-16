public class BinarySearchIterative {
    public static void main(String[] args) {

        int arr[] = { 10, 12, 14, 16, 18, 20 };
        int size = arr.length;
        int search = 15;
        System.out.println(binarySearch(arr, size, search));
    }

    public static int binarySearch(int arr[], int size, int search) {
        int start = 0;
        int end = size - 1;
        while (start <= end) {
            int mid = start + (end - end) / 2;
            if (search == arr[mid])
                return mid;
            else if (search < arr[mid])
                end = mid - 1;
            else
                start = mid + 1;
        }
        return -1;
    }
}