package dsa_challenge;

public class FloorCeiling {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,19};
        int target = 0;
        System.out.println("Floor: " + floor(arr,target));
        System.out.println("ceiling: " + ceiling(arr, target));
    }

    public static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] <= target) {
                start = mid + 1;
            }
            else if (arr[mid] > target) {
                end = mid - 1;
            }
        }
        if (end == -1) {
            return -1;
        }
        return arr[end];
    }

    public static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            }
            else if (arr[mid] >= target) {
                end = mid - 1;
            }
        }
        if (start == arr.length) {
            return -1;
        }
        return arr[start];
    }
}
