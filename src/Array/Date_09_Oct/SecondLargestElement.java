package Array.Date_09_Oct;

//todo BRUTE FORCE


//import java.util.Arrays;
//
//public class SecondLargestElement {
//    public static int secondLargestElement(int[] nums) {
//        Arrays.sort(nums);
//        int n=nums.length;
//        int largest =nums[n-1];
//        int slargest=-1;
//        for(int i=n-2;i>=0;i--){
//            if(nums[i]!=largest){
//                slargest=nums[i];
//                break;
//            }
//        }
//        return slargest;
//
//    }
//
//    public static void main(String[] args) {
//        int[]nums={8,8,2,5,7};
//        System.out.println(secondLargestElement(nums));
//    }
//
//}

//Time Complexity = O(n log n) +O(n) [agr pura array traverse hua to ] = O(n log n)
//Space Complexity = O(log n)


//todo Better approach

//public class SecondLargestElement {
//    public static int secondLargestElement(int[] nums) {
//        int n =nums.length;
//        int largest=nums[0];
//        for(int i=0;i<n;i++){
//            if(nums[i]>largest){
//                largest=nums[i];
//            }
//        }
//
//        int slargest=-1;
//        for(int i=0;i<n;i++){
//            if(nums[i]>slargest && nums[i]!=largest){
//                slargest=nums[i];
//            }
//        }
//        return slargest;
//
//    }
//
//    public static void main(String[] args) {
//        int[]nums={8,8,7,6,5,};
//        System.out.println(secondLargestElement(nums));
//    }
//}

// Time Complexity = O(2n)
// Space Complexity = O(1)

//todo Optimal Approach

public class SecondLargestElement {
    public static int secondLargestElement(int[] nums) {
        int n =nums.length;
        int largest=nums[0];
        int slargest=-1;
        for(int i=0;i<n;i++){
            if(nums[i]>largest){
                slargest=largest;
                largest=nums[i];
            }else if(nums[i]<largest && nums[i]>slargest){
                slargest=nums[i];
            }
        }
        return slargest;

    }

    public static void main(String[] args) {
        int[]nums={8,8,7,6,5};
        System.out.println(secondLargestElement(nums));
    }
}

// Time Complexity = O(n)
// Space Complexity = O(1)

