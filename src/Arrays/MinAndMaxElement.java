package Arrays;
//Given an array of size N. The task is to find the maximum
//and the minimum element of the array using the minimum
//number of comparisons

public class MinAndMaxElement {
    static void minMaxOptimised(int[] arr){
        int n = arr.length;
        int i = 0, max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        if(n%2 == 0){
            if(arr[0] > arr[1]){
                max = arr[0];
                min = arr[1];
            } else{                    // arr[0] < arr[1]
                max = arr[1];
                min = arr[0];
            }
            i = 2;
        }
        else{                          // n % 2 != 0
            max = arr[0];
            min = arr[0];
            i = 1;
        }
        while (i<n){
            if(arr[i] > arr[i+1]){
                if(arr[i] > max) max = arr[i];
                if(arr[i+1] < min) min = arr[i+1];
            }
            else{               // arr[i] < arr[i+1]
                if(arr[i] < min) min = arr[i];
                if(arr[i+1] > max) max = arr[i+1];
            }
            i += 2;
        }
        System.out.println("Using optimised code(minimum comparison) :- ");
        System.out.println("Maximum Element : "+max);
        System.out.println("Minimum Element : "+min);
    }
    static void minMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        System.out.println("Using brute force method :- ");
        System.out.println("Maximum Element : "+max);
        System.out.println("Minimum Element : "+min);
    }
    public static void main(String[] args) {

        int[] arr = {4, 5, 20, 19, 32, 10, 19, 21};
        minMax(arr);
        minMaxOptimised(arr);
    }

}
