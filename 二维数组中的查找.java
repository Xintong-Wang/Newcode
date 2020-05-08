public class Solution {
    public boolean Find(int target, int [][] array) {
        int x = array.length, y = array[0].length;
        int row = 0, col = y - 1;
        while(row < x && col >= 0 ){
            if(target < array[row][col]){
                col--;
            }
            else{
                if(target == array[row][col]){
                    return true;
                }
                row++;
            }
        }
        return false;
    }
}
