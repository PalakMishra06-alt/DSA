package Array.Date_27_Oct;

import java.util.Arrays;

//public class SortAnArrayOf0s1s2s_75 {
//    public static void sortColors(int[] nums) {
//        int n =nums.length;
//        int count0= 0;
//        int count1 =0;
//        int count2 =0;
//        int idx=0;
//
//        for(int i =0;i<n;i++){
//            if(nums[i]==0){
//                count0++;
//            }else if(nums[i]==1){
//                count1++;
//            }else {
//                count2++;
//            }
//        }
//
//        for(int i=0;i<count0;i++){
//            nums[idx]=0;
//            idx++;
//        }
//        for(int i=0;i<count1;i++){
//            nums[idx]=1;
//            idx++;
//        }
//        for(int i=0;i<count2;i++){
//            nums[idx]=2;
//            idx++;
//        }
//    }
//
//    public static void main(String[] args) {
//        int[]nums={2,0,2,1,1,0,1,2,0,0};
//        sortColors(nums);
//        System.out.println(Arrays.toString(nums));
//    }
//}

//Time Complexity = O(2n)
//Space Complexity = O(1)


//todo OPTIMAL SOLUTION

public class SortAnArrayOf0s1s2s_75 {
    public static void sortColors(int[] nums) {
        int n =nums.length;
        int mid=0;
        int high=n-1;
        int low=0;

        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[low];
                nums[low]=nums[mid];
                nums[mid]=temp;
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                int temp=nums[high];
                nums[high]=nums[mid];
                nums[mid]=temp;
                high--;
            }
        }

    }

    public static void main(String[] args) {
        int[]nums={2,0,2,1,1,0,1,2,0,0};
        sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}

//Time Complexity = O(n)
//Space Complexity = O(1)
