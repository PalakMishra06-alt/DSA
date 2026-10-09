package Array.Date_09_Oct;

//todo LINEAR SEARCH
public class LinearSearch {
    public static int linearSearch(int nums[], int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[]nums={1,-4,5,8,22,-8,2};
        int target=8;
        int result =linearSearch(nums , target);
        System.out.println(result);

    }
}

//Time complexity= O(n)
//Space complexity=O(1)
