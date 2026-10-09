package Array.Date_09_Oct;

//todo BRUTE FORCE
//import java.util.Arrays;
//
//public class LargestElement {
//    public static int largestElement(int[] nums) {
//        Arrays.sort(nums);
//        return nums[nums.length-1];
//
//    }
//
//    public static void main(String[] args) {
//        int[]nums ={1,5,2,3,2,7,4};
//        System.out.println(largestElement(nums));
//
//    }
//}

//Time Complexity=O(n log n) todo beacuse sorting takes nlogn complexity
//Space Complexity = O(log n) todo for Java's primitive array sorting implementation


//todo OPTIMAL APPROACH

public class LargestElement{
    public static int largestElement(int[] nums) {
        int largest = nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest =nums[i];
            }
        }
        return largest;


    }

    public static void main(String[] args) {
        int[]nums ={5,2,6,0,2,9,7};
        System.out.println(largestElement(nums));
    }
}

//Time Complexity = O(n)
//Space Complexity = O(1)