public class ArrayRotation {

    public static void main(String args[]) {
        int arr[] = { 10, 11, 12, 13, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int size = arr.length;
        System.out.print(arrayRotationCount(arr, size));
    }

    static int arrayRotationCount(int[] arr, int size) {
        int low = 0;
        int high = size - 1;
        while (low <= high) {
            int mid = (high + low) / 2;
            if (arr[low] <= arr[high]) {
                return low;
            }
            int next = (mid + 1) % size;
            int priv = (mid + size - 1) % size;
            if (arr[mid] <= arr[next] && arr[mid] < arr[priv]) {
                return mid;
            } else if (arr[mid] <= arr[high]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}