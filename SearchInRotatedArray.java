public class SearchInRotatedArray {
    public static void main(String args[]) {
        int arr[] = { 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int size = arr.length;
        System.out.print(searchElement(arr, size, 5));
    }

    private static int searchElement(int arr[], int size, int search) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (search == arr[mid]) {
                return mid;
            } else if (arr[mid] <= arr[high]) {
                if (search > arr[mid] && search <= arr[high]) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            } else if (arr[low] <= arr[mid]) {
                if (search > arr[low] && search <= arr[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }
}