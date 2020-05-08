public class Solution {
    public int RectCover(int target) {
        int i = 1, j = 2;
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        int res = 0;
        while(target > 2){
            res = i + j;
            i = j;
            j = res;
            target--;
        }
        return res;
    }
}
