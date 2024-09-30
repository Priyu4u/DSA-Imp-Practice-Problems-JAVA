package Arrays;

import java.util.HashSet;
import java.util.Set;

//Given an integer array, return true if any value appears at
//least twice in the array, and return false if every element is
// distinct
public class ContainsDuplicate {

    static boolean duplicateOptimised(int[] arr){
        // empty hashset to store integers
        Set<Integer> intSet = new HashSet<>();
        for(int num : arr){
            if(intSet.contains(num)){
                return true;
            }
            intSet.add(num);
        }
        return false;
    }
    static boolean bruteForce(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]) return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,1};
        System.out.println("Is duplicate present(Brute Force Method) : "+bruteForce(arr));
        System.out.println("Is duplicate present(Optimised Method) : "+duplicateOptimised(arr));
    }
}
