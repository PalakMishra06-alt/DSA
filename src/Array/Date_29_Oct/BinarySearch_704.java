package Array.Date_29_Oct;

public class BinarySearch_704 {
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int start=0;
        int end=n-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>nums[mid]){
                start=mid+1;
            }else if(target<nums[mid]){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int[]nums={-1,0,3,4,7,8,12};
        System.out.println(search(nums,4));
    }
}

//Time Complexity=O(log n)
//Space Complexity = O(1)
