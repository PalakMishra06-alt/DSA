package Array.Date_07_Oct;

//todo Better approach

// Time complexity = O(n)
// Space Complexity = O(k)  temp takes extra space

//public class RightRotateArrayByk_189{
//    public static void rotate(int[] nums, int k) {
//
//        int n = nums.length;
//
//        k=k%n;
//
//        int [] temp = new int[k];
//
//        //Store last k elements
//        for(int i=0;i<k;i++){
//            temp[i]=nums[n-k+i];
//
//        }
//        //Shifting remaining elements to right
//        for(int i=n-k-1;i>=0;i--){
//            nums[i+k]=nums[i];
//        }
//
//        //put temp at beginning
//        for(int i=0;i<k;i++){
//            nums[i]= temp[i];
//        }
//    }
//
//    public static void main(String[] args) {
//        int[] nums = {1,2,3,4,5,6,7};
//        int k=3;
//
//        rotate(nums , k);
//
//        for(int i=0;i<nums.length;i++){
//            System.out.println(nums[i]);
//    }
//}
//
//
//}














//todo Optimal approach

 //Time Complexity = O(n)
 //Space Complexity = 0(1) because we does not have any need for temp to store

public class RightRotateArrayByk_189 {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;

        k=k%n;

        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);

    }
    public static void reverse(int[]nums , int start , int end){
        while(start<end){
            int temp=nums[start];
            nums[start] =nums[end];
            nums[end]=temp;

            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        int k=3;

        rotate(nums , k);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

    }
}

