public class Solution {
    public int JumpFloor(int target) {
        int i = 1, j = 2;
        int temp = 0;
        if(target == 1)
            return i;
        if(target == 2)
            return j;
        while(target >= 3){
            temp = i + j;
            i = j;
            j = temp;
            target--;
        }
        return temp;
    }
}
