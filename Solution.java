package leetcode_7_reverse_integer;

public class Solution {
    public static int reverse(int x) {
        int flag = 0;
        int result = 0;
        
        /* block if x = -2147483648 
           -x = 2147483648 then overflow
        */
        if(x == 0 || x == -2147483648) { 
            return 0;
        }
        
        flag = (x > 0) ? 1 : -1;
        x = (x > 0) ? x : -x;
        
        for (;x > 9;) {
            result = result * 10 + x % 10;
            x = x / 10;
        }
        
        //check overflow or not
        if (result > 214748364) {
                return 0;
        }

        result = (result == 0) ? x : (result * 10 + x);
        
        return result * flag;
    }
}