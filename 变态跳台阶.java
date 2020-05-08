public class Solution {
    public int JumpFloorII(int target) {
        return (int)Math.pow(2, target - 1);
    }
}
// 每增加一节台阶，增加的次数前一次的两倍
