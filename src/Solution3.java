
//724. Find Pivot Index
public class Solution3 {
    public static int pivotIndex(int[] nums) {
        int n = nums.length;

        for(int i=1; i<n; i++){
            nums[i] += nums[i-1];
        }

        if(nums[n-1] - nums[0] == 0) {
            return 0;
        }

        for(int i=1; i<n-1; i++){
            if(nums[i-1] == nums[n-1] - nums[i])
                return i;
        }

        if(nums[n-2]==0) {
            return n - 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};

        int ret = pivotIndex(nums);

        System.out.println(ret);
    }
}
