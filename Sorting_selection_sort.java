public class Sorting_selection_sort {
    public static void printArray(int arr[]){
        for (int i = 0 ; i< arr.length ; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {7, 8, 3, 1, 2};
        //time complexity of selection sort is O(n^2)
        //selection sort algorithm
        for(int i = 0; i<arr.length ; i++){
            int smallest = i ;
            for(int j = i+1 ; j<arr.length ; j++){
                if(arr[smallest]> arr[j]){
                    smallest = j ;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp ;
        }
        printArray(arr);
    }
}
