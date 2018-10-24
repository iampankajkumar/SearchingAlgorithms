public class BinarySearch {
    private static int binarySearch(int[] arr, int size, int search, boolean searchFirst) {
        int low = 0;
        int high = size - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (search == arr[mid]) {
                result = mid;

                if (searchFirst) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else if (search > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 11, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 22, 23, 44, 45, 56, 78, 89 };
        System.out.println(binarySearch(arr, arr.length, 15, false) - binarySearch(arr, arr.length, 15, true) + 1);
    }
}