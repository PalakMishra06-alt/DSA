package Array.Date_18_Oct;

//todo BRUTE FORCE

//public class MissingNumber_268 {
//    public static int missingNumber(int[] nums) {
//        int n=nums.length;
//        for(int i=0;i<=n;i++){
//            int flag=0;
//            for(int j=0;j<n;j++){
//                if(nums[j]==i){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag==0){
//                return i;
//            }
//        }
//
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[]nums={0,1,3};
//        System.out.println(missingNumber(nums));
//    }
//}

// Time Complexity = O(N*N)
// Space Complexity = O(1)


//todo OPTIMAL SOLUTION

public class MissingNumber_268 {
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int s2=0;
        int sum=n*(n+1)/2;
        for(int i =0;i<n;i++){
            s2+=nums[i];
        }

        return sum-s2;


    }

    public static void main(String[] args) {
        int[]nums={9,8,4,2,1,0,6,7,3};
        System.out.println(missingNumber(nums));
    }
}

//Time Complexity = O(N)
//Space Complexity = O(1)

