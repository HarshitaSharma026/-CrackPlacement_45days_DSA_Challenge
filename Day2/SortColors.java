import java.io.*;
import java.util.*;

// REVISION REQUIRED

class SortColors {

    // naive approach
    public static void answer(int[] arr, int n) {
        int count0= 0 , count1 = 0, count2 = 0;
        for(int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            }
            else if (arr[i] == 1) {
                count1++;
            }
            else {
                count2++;
            }
        }
        int i = 0, k = 0;
        while(i < count0) {
            arr[k] = 0;
            k++; i++;
        }
        i = 0;
        while(i < count1) {
            arr[k] = 1;
            k++; i++;
        }
        i = 0;
        while(k < n && i < count2) {
            arr[k] = 2;
            k++; i++;
        }
    }

    // better approach
    // using dutch national flag algorithm, work in partitions
        // taking three pointers: for each number
    public static void dutch_algo(int[] nums) {
        
        int low0 = 0, mid1 = 0, high2 = nums.length - 1;
        while(mid1 <= high2) {
            if (nums[mid1] == 0) {
                int temp = nums[mid1];
                nums[mid1] = nums[low0];
                nums[low0] = temp;
                mid1++; low0++;
            }
            else if (nums[mid1] == 2) {
                int temp = nums[mid1];
                nums[mid1] = nums[high2];
                nums[high2] = temp; 
                high2--;
            }
            else if (nums[mid1] == 1){
                mid1++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 6;
        int[] arr = {2,0,2,1,1,0};
        answer(arr, n);
        System.out.println(Arrays.toString(arr));
    }
}