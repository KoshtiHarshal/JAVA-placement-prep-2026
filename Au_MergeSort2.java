// MERGE SORT

// Method 2: Using recursion and in-place merging
public class Au_MergeSort2 {
    public static int[] mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;

            int a[] = new int[mid];
            int b[] = new int[arr.length - mid];

            for (int i = 0; i < mid; i++) {
                a[i] = arr[i];
            }
            for (int i = mid; i < arr.length; i++) {
                b[i - mid] = arr[i];
            }

            mergeSort(a);
            mergeSort(b);

            int i = 0; 
            int j = 0; 
            int k = 0; 

            while (k < arr.length) {
                if (j == b.length) {
                    arr[k] = a[i];
                    i++;
                } else if (i == a.length) {
                    arr[k] = b[j];
                    j++;
                } else if (a[i] < b[j]) {
                    arr[k] = a[i];
                    i++;
                } else {
                    arr[k] = b[j];
                    j++;
                }
                k++;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 3, 2, 6, 4};
        
        int sortedArray[] = mergeSort(arr1);
        
        System.out.print("Sorted Array using Merge Sort method : [");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i]);
            
            if (i < sortedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

// Time Complexity: O(n log n) where n is the number of elements in the array. This is because we are dividing the array into two halves log n times and merging takes O(n) time.
// Space Complexity: O(n) because we are using extra space for the left and right sub arrays.