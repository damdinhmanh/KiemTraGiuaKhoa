import java.util.HashSet;
import java.util.Set;

//202. Happy Number
public class Solution2 {
    public static boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        int temp = n;

        while (true){
            int sum=0;
            while (n!=0) {
                int s = n%10;
                sum += s*s;
                n/=10;
            }

            if (sum==1){
                return true;
            } else {
                if(set.contains(sum)){
                    return false;
                } else {
                    set.add(sum);
                    n = sum;
                }
            }
        }
    }

    public static void main(String[] args) {
        boolean ret = isHappy(19);

        System.out.println(ret);
    }
}
