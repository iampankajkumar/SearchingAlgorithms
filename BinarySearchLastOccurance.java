public class BinarySearchLastOccurance {
    public static void main(String[] args) {

        int arr[] = { 10, 12, 14, 14, 15, 15, 16, 18, 20 };
        int size = arr.length;
        int search = 14;
        System.out.println(binarySearch(arr, size, search));
    }

    private static int binarySearch(int arr[], int size, int search) {
        int low = 0;
        int high = size - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (search == arr[mid]) {
                result = mid;
                low = mid + 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}