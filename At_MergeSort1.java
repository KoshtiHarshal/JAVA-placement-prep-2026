// MERGE SORT

// Method 1: Using extra space
public class At_MergeSort1 {
    public static void conquer(int arr[], int l, int mid, int r){
        int merged[] = new int[r - l + 1];
        
        int idx1 = l;
        int idx2 = mid + 1;
        int x = 0;

        while(idx1 <= mid && idx2 <= r){
            if (arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
            
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= r){
            merged[x++] = arr[idx2++];
        }
        for (int i = 0, j = l; i < merged.length; i++, j++){
            arr[j] = merged[i];
        }
    }
    public static void divide(int arr[], int l, int r){
        if (l >= r){
            return;
        } 
        int mid = l + (r - l) / 2;
        divide (arr, l, mid);
        divide (arr, mid+1, r);

        conquer(arr, l, mid, r);

    }
    public static void main(String args []){
        int arr[] = {4,6,3,1,7,5,8,2};
        int n = arr.length;
        divide(arr, 0, n-1);
        for ( int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }   
}

// Time Complexity: O(n log n) where n is the number of elements in the array. This is because we are dividing the array into two halves log n times and merging takes O(n) time.
// Space Complexity: O(n) because we are using an extra array to store the merged result