public class Solution {
    public int NumberOf1(int n) {
        String s = Integer.toBinaryString(n);
        int res = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '1')
                res++;
        }
        return res;
    }
}


public class Solution {
    public int NumberOf1(int n) {
        int res = 0;
        while(n != 0){
            res += (n & 1);
            n >>>= 1;
        }
        return res;
    }
}
