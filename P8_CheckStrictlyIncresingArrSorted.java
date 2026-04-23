// P : Check if an array is sorted(Strictly Increasing).

public class P8_CheckStrictlyIncresingArrSorted{
    public static boolean isSorted(int arr[] , int idx){
        if(idx == arr.length-1){
            return true;
        }
        if(arr[idx] < arr[idx+1]){
            return isSorted(arr, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String args[]) {
        int arr[] = {1,2,3,4,5,6};
        isSorted(arr, 0);
        System.out.println(isSorted(arr, 0));
    }
}
// Time Complexity : O(n)