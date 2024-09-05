package Arrays;

public class reversingArray {
    static void printArray(int[] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    static void reverseArray(int[] arr){
        int i = 0, j = arr.length-1;
        while(i<j){
            // swap arr[i] and arr[j]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        int[] arr = {4, 5, 20, 19, 32, 10, 19, 21};
        System.out.print("Before reverse : ");
        printArray(arr);
        reverseArray(arr);
        System.out.print("\nAfter reverse : ");
        printArray(arr);

    }
}
