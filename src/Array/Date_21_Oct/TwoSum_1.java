package Array.Date_21_Oct;

//todo BRUTE APPROACH

//import java.util.Arrays;
//
//public class TwoSum_1 {
//    public static int[] twoSum(int[] nums, int target) {
//        int n =nums.length;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                if(nums[i]+nums[j]==target){
//                    return new int[] {i,j};
//                }
//            }
//
//
//
//        }
//        return new int[]{};
//    }
//
//    public static void main(String[] args) {
//        int[]nums={2,6,7,3,5};
//        int target=10;
//        System.out.println(java.util.Arrays.toString(twoSum(nums,target)));
//    }
//}

//Time Complexity = O(N*N)
//Space Complexity = O(1)


//todo OPTIMAL SOLUTION


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum_1 {
    public static  int[] twoSum(int[] nums, int target) {
        HashMap<Integer , Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            int required = target-nums[i];
            if(map.containsKey(required)){
                return new int[] {map.get(required),i};

            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[]nums={2,6,7,3,5};
        int target=10;
        System.out.println(java.util.Arrays.toString(twoSum(nums,target)));
    }

}

//Time Complexity = O(N)
//Space Complexity = O(N)





