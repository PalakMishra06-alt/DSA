package Array.Date_19_Oct;

//public class RemoveDuplicates_26 {
//    public static int removeDuplicates(int[] nums) {
//        int n=nums.length;
//        int[] temp=new int[n];
//        temp[0]=nums[0];
//        int k=1;
//        for(int i =1;i<n;i++){
//            if(nums[i]!=nums[i-1]){
//                temp[k]=nums[i];
//                k++;
//            }
//        }
//        for(int i=0;i<k;i++){
//            nums[i]=temp[i];
//        }
//        return k;
//    }
//
//    public static void main(String[] args) {
//        int[]nums={1,2,3,4,5,6,6,7};
//        System.out.println(removeDuplicates(nums));
//    }
//}

//Time Complexity = O(2N)
//Space Complexity =O(N)

//todo OPTIMAL SOLUTION

public class RemoveDuplicates_26 {
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        for(int j=1;j<n;j++){
            if(nums[j]!=nums[i]){
                nums[i+1]=nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,6,7};
        System.out.println(removeDuplicates(nums));

    }
}

//Time Complexity = O(N)
//Space Complexity =O(1)


