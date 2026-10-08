package Array.Date_08_Oct;

//todo Better Approach
//public class LeftRotateArrayBykplaces {
//    public static void rotateArray(int[] nums, int k) {
//        int n=nums.length;
//        k=k%n;
//
//        int[] temp = new int[k];
//
//        //Store first k elements
//        for(int i=0;i<k;i++){
//            temp[i]=nums[i];
//        }
//
//        //Shifting remaining elements to left
//        for(int i=k;i<n;i++){
//            nums[i-k]=nums[i];
//        }
//
//        //put temp at end
//        for(int i=0;i<k;i++){
//            nums[n-k+i]=temp[i];
//        }
//
//    }
//
//    public static void main(String[] args) {
//        int[]nums={1,2,3,4,5};
//        int k=2;
//
//        rotateArray(nums,k);
//
//        for(int i=0;i< nums.length;i++){
//            System.out.println(nums[i]);
//        }
//    }
//}


//todo Optimal approach
public class LeftRotateArrayBykplaces {
    public static void rotateArray(int[] nums, int k) {
        int n=nums.length;
        k=k%n;

        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
        reverse(nums,0,n-1);

    }

    public static void  reverse(int[]nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[]nums ={1,2,3,4,5};
        int k=2;

        rotateArray(nums,k);

        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
    }
}

