public class BinarySearchFrequency {
    public static void main(String[] args) {

        int arr[] = { 1, 1, 3, 3, 5, 5, 5, 5, 9, 9, 11 };
        int size = arr.length;
        int search = 5;
        System.out.println(findCount(arr, size, search));
    }

    private static int findCount(int arr[], int size, int search) {
        int first = findFirst(arr, size, search);
        int last = findLast(arr, size, search);
        if (first > 0 && last > 0)
            return last - first + 1;
        else
            return 0;
    }

    private static int findFirst(int arr[], int size, int search) {
        int low = 0;
        int high = size - 1;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (search == arr[mid]) {
                result = mid;
                high = mid - 1;
            } else if (search < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }

    private static int findLast(int arr[], int size, int search) {
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