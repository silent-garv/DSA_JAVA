public class Sorting_insertion_sort{
    public static void printArray (int arr[]) {
        for(int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    // time complexity of insertion sort is O(n^2)
    // insertion sort algorithm
    public static void main(String[] args) {
        int arr[] = {7,8,9,3,1,2};
        for(int i = 1 ; i<arr.length ; i++){
            int current = arr[i];
            int j = i-1;
            while (j >=  0  && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current ;
        }
        printArray(arr);
    }
}
