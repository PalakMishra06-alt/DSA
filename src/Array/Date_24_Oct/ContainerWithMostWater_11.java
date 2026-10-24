package Array.Date_24_Oct;

//todo Brute Force (but this will give TLE as the size should be less than 10**5 and a normal array should have 10**8 but in this case 10**5)

//public class ContainerWithMostWater_11 {
//    public static int maxArea(int[] height) {
//        int n = height.length;
//        int max_water=0;
//        for(int i=0;i<n;i++){
//            for(int j=i+1;j<n;j++){
//                int w=j-i;
//                int h=Math.min(height[i],height[j]);
//                int curr_water=w*h;
//
//                max_water=Math.max(max_water , curr_water);
//            }
//        }
//        return max_water;
//
//    }
//
//    public static void main(String[] args) {
//        int[]height={1,8,6,2,5,4,8,3,7};
//        System.out.println(maxArea(height));
//
//    }
//}

//Time Complexity = O(N*N)
//Spcae Complexity =O(1)

//todo OPTIMAL SOLUTION

public class ContainerWithMostWater_11 {
    public static  int maxArea(int[] height) {
        int n = height.length;
        int left = 0;
        int right = n - 1;
        int max_water = 0;
        while (left < right) {
            int w = right - left;
            int h = Math.min(height[left], height[right]);
            int curr_water = w * h;
            max_water = Math.max(max_water, curr_water);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max_water;
    }

    public static void main(String[] args) {
        int[]height ={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));

    }

}

//Time Complexity = O(n)
//Space Complexity =O(1)