package Array.Date_25_Oct;

//todo BRUTE FORCE

//public class TrappingRainWater_42 {
//    public static int trap(int[] height) {
//        int n=height.length;
//        int water=0;
//
//        for(int i=1;i<n-1;i++){
//            int leftmax=0;
//            int rightmax=0;
//
//            for( int j=0;j<=i;j++){
//                leftmax=Math.max(leftmax , height[j]);
//            }
//            for(int k=i;k<n;k++){
//                rightmax=Math.max(rightmax ,height[k]);
//
//            }
//            water+=Math.min(leftmax, rightmax)-height[i];
//
//        }
//        return water;
//    }
//
//    public static void main(String[] args) {
//        int[]height = {4,2,0,3,2,5};
//        System.out.println(trap(height));
//    }
//}

//Time Complexity = O(N*N)
//Space Complexity = O(1)

//todo OPTIMAL SOLUTION

public class TrappingRainWater_42 {
    public static int trap(int[] height) {
        int n=height.length;
        int left=0;
        int right=n-1;
        int water=0;
        int lmax=0;
        int rmax=0;

        while(left<right){
            lmax=Math.max(lmax , height[left]);
            rmax=Math.max(rmax , height[right]);

            if(lmax<rmax){
                water+=lmax-height[left];
                left++;
            }else{
                water+=rmax-height[right];
                right--;
            }
        }
        return water;


    }

    public static void main(String[] args) {
        int[]height={4,2,0,3,2,5};
        System.out.println(trap(height));
    }
}

//Time Complexity = O(n)
//Space Complexity = O(1)
