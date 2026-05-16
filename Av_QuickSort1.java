// QUICK SORT

// Method 1: Using the last element as the pivot
public class Av_QuickSort1 {
    public static int partition(int arr[], int l, int r){
        int pivotel = arr[r];
        int i = l-1;

        for(int j=l; j<r; j++){
            if (arr[j] < pivotel){
               i++;
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[r];
        arr[r] = temp;
        return i;
    }
    public static void quickSort(int arr[], int l, int r){
        if (l<r){
            int pivot = partition(arr, l, r);

            quickSort(arr, l, pivot-1);
            quickSort(arr, pivot+1, r);
        }
    }
    public static void main(String args[]){
        int arr[] = {4,6,2,5,8,1,7,3};
        int n = arr.length;
        quickSort(arr, 0, n-1);

        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

// Time Complexity: O(n log n) on average, O(n^2) in the worst case (when the smallest or largest element is always chosen as the pivot).
// Space Complexity: O(log n) on average, O(n) in the worst case (when the smallest or largest element is always chosen as the pivot).