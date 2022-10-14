//1512. Number of Good Pairs
public class Solution1 {
    public static int numIdenticalPairs(int[] nums) {
        int cntVal[] = new int[101], res = 0;

        for (int n: nums) {
            cntVal[n]++;
        }

        for (int i = 0; i <= 100; ++i) {
            res += cntVal[i] * (cntVal[i] - 1) / 2;
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        int ret = numIdenticalPairs(nums);
        System.out.println(ret);
    }
}
