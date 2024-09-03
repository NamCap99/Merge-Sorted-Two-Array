package LeetCode;



public class MergeSortedArray{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m - 1; // Pointer for nums1
        int p2 = n - 1; // Pointer for nums2
        int p = m + n - 1; // Pointer for the last position in nums1
    
        // While both arrays have elements to compare
        while (p1 >= 0 && p2 >= 0) {
            if (nums1[p1] > nums2[p2]) {
                nums1[p] = nums1[p1];
                p1--;
            } else {
                nums1[p] = nums2[p2];
                p2--;
            }
            p--;
        }
    
        // If there are still elements in nums2, place them in nums1
        while (p2 >= 0) {
            nums1[p] = nums2[p2];
            p--;
            p2--;
        }
    }
    
    public static void printArray(int[] nums){
        for(int a: nums){
            System.out.print(a + "\t");
        }
    }

    public static void main(String[] args){
        int[] num1 = {1,2,3,0,0,0};
        int[] num2 = {2,5,6};

        merge(num1, 3,num2,3);
        System.out.println("Merge Array is ");
        printArray(num1);
    }
}
