package Array.Date_22_Oct;

//todo BRUTE FORCE (But all cases will not pass as the time limit exceeded when array is too large to operate)
import java.util.*;
//
//public class ThreeSum_15 {
//    public static List<List<Integer>> threeSum(int[] nums) {
//        int n=nums.length;
//        Set<List<Integer>> st = new HashSet<>();
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                for(int k=j+1;k<n;k++){
//                    if(nums[i]+nums[j]+nums[k]==0){
//                        List<Integer> temp= Arrays.asList(nums[i],nums[j],nums[k]);
//                        temp.sort(null);
//                        st.add(temp);
//                    }
//                }
//            }
//        }
//        return new ArrayList<>(st);
//    }
//
//    public static void main(String[] args) {
//        int[]nums={-1,0,1,2,-1,-4};
//        System.out.println(threeSum(nums));
//    }
//}

// Time Complexity = O(N*N*N)
// Space Complexity = O(N*N)


//todo OPTIMAL SOLUTION

public class ThreeSum_15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        List<List<Integer>> temp=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;



            while(left<right){
                int sum =nums[i]+nums[left]+nums[right];
                if(sum==0){
                    temp.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;

                    while(left<right && nums[left]==nums[left-1]){
                        left++;
                    }

                }else if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }

        return temp;
    }

    public static void main(String[] args) {
        int[]nums={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
}

//Time Complexity = O(N*N)
//Space Complexity = O(1)

