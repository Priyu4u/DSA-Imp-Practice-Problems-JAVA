package Arrays;

//Given an integer array nums, find the subarray
//with the largest sum, and return its sum.

public class MaximumSubarray {


    // Kadane's Algorithm
    static int maxSum(int[] arr){
        int currSum = 0, maxSum = Integer.MIN_VALUE, n = arr.length;
        for(int i=0; i<n; i++){
            currSum += arr[i];
            maxSum = Integer.max(currSum,maxSum);
            if(currSum < 0) currSum = 0;
        }
        return maxSum;
    }


    // Better Approach      -> Time Complexity : O[n^2]
    static int maxSumBetter(int[] arr){
        int maxSum = Integer.MIN_VALUE, n = arr.length;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += arr[j];
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }

    // Brute Force Method   ->  Time complexity : O[n^3]
    static int maxSumBrute(int[] arr){
        int maxSum = Integer.MIN_VALUE, n = arr.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int sum = 0;
                for(int k=i; k<=j; k++){
                    sum += arr[k];
                }
                maxSum = Math.max(sum,maxSum);
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("Maximum subarray sum : ");
        System.out.println("Using brute force approach : "+maxSumBrute(arr));
        System.out.println("Using better approach : "+maxSumBetter(arr));
        System.out.println("Using Kadane's Algo : "+maxSum(arr));
    }
}
