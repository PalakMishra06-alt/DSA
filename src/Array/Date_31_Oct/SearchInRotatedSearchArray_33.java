package Array.Date_31_Oct;

public class SearchInRotatedSearchArray_33 {
    public static int search(int[] nums, int target) {
        int n=nums.length;
        int st=0;
        int end=n-1;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]==target){
                return mid;
            }

            if(nums[st]<=nums[mid]){  //left sorted
                if(nums[st]<=target && target<=nums[mid]){
                    end=mid-1;
                }else{
                    st=mid+1;
                }
            }else{  //right sorted
                if(nums[mid]<=target && target<=nums[end]){
                    st=mid+1;
                }else{
                    end=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums={4,5,6,7,0,1,2};
        System.out.println(search(nums,0));
    }
}

//Time Complexity = O(log n)
//Space Complexity = O(1)
