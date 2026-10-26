package Array.Date_26_Oct;

//todo BRUTE FORCE

//public class MergeSortedArray_88 {
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//
//        int i = 0;
//        int j = 0;
//        int k = 0;
//
//        int[] nums3 = new int[m + n];
//
//        while (i < m && j < n) {
//            if (nums1[i] < nums2[j]) {
//                nums3[k] = nums1[i];
//                i++;
//
//            } else {
//                nums3[k] = nums2[j];
//                j++;
//
//            }
//            k++;
//
//        }
//
//        while (i < m) {
//            nums3[k] = nums1[i];
//            i++;
//            k++;
//        }
//
//        while (j < n) {
//            nums3[k] = nums2[j];
//            j++;
//            k++;
//        }
//
//        for (int p = 0; p < m + n; p++) {
//            nums1[p] = nums3[p];
//        }
//
//
//    }
//
//
//    public static void main(String[] args) {
//        int[] nums1 = {1, 2, 3, 0, 0, 0};
//        int[] nums2 = {2, 5, 6};
//        merge(nums1, 3, nums2, 3);
//        System.out.println(java.util.Arrays.toString(nums1));
//    }
//}

//Time Complexity = O(m+n)
//Space Complexity = 0(m+n)

//todo OPTIMAL SOLUTION

public class MergeSortedArray_88 {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[idx]=nums1[i];
                idx--;
                i--;
            }else{
                nums1[idx]=nums2[j];
                idx--;
                j--;
            }
        }

        while(j>=0){
            nums1[idx]=nums2[j];
            idx--;
            j--;
        }

    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
       System.out.println(java.util.Arrays.toString(nums1));
    }
}

//Time Complexity = O(m+n)
//Space Complexity = O(1)
