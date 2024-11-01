package Arrays;


// Given an array nums, return true if the array was originally sorted
// in non-decreasing order, then rotated some number of positions
// (including zero). Otherwise, return false.
// There may be duplicates in the original array

public class CheckSortedArray {

    static boolean check(int[] nums){
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n ; i++){
            if(nums[i] > nums[(i+1) % n]){
                count++ ;
            }
        }
        return count <= 1;
    }
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        int[] nums2 = {2,1,3,4};
        System.out.println(check(nums2));
    }
}
