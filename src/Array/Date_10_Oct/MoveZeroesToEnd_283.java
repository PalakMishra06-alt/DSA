package Array.Date_10_Oct;

//todo Brute force

//public class MoveZeroesToEnd_283 {
//
//    public static void moveZeroes(int[] nums) {
//
//        //Storing non-zero elements in temp
//        int[]temp = new int[nums.length];
//        int k=0;
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0){
//                temp[k]=nums[i];
//                k++;
//
//            }
//        }
//        //storing temp values in original array
//        for(int i=0;i<k;i++){
//            nums[i]=temp[i];
//        }
//        //Filling remaining with zeros
//
//        for(int i=k;i<nums.length;i++){
//            nums[i]=0;
//        }
//
//
//    }
//
//    public static void main(String[] args) {
//        int[]nums={1,0,0,3,6,7,0,34,2,0,0,1};
//        moveZeroes(nums);
//
//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//        }
//    }
//}

// Time Complexity=O(2n)
// Space Complexity=O(n)

//todo Optimal Solution

public class MoveZeroesToEnd_283 {
    public static void moveZeroes(int[] nums) {

        int n = nums.length;
        int j = -1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for (int i = j + 1; i < n; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }



    }

    public static void main(String[] args) {
        int[]nums={1,0,0,3,6,7,0,34,2,0,0,1};
        moveZeroes(nums);

        for(int i=0;i< nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}

//Time Complexity=O(n)
// Space Complexity=O(1)

