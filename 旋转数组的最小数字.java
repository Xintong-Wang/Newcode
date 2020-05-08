import java.util.ArrayList;
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        int left = 0, right = array.length - 1;
        while(left < right){
            int mid = left + (right - left) / 2;
            if(array[mid] < array[right]){
                right = mid;
            }
            else if(array[mid] > array[left]){
                left = mid + 1;
            }
            else{
                left++;
            }
        }
        return array[left];
    }
}
