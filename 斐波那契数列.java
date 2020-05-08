public class Solution {
    public int Fibonacci(int n) {
        int i = 0, j = 1;
        int temp = 0;
        if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        while(n >= 2){
            temp = i + j;
            i = j;
            j = temp;
            n--;
        }
        return temp;
    }
}
