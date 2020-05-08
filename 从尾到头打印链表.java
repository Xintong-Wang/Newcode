/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.ArrayList;
public class Solution {
    ArrayList<Integer> res = new ArrayList();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        
        if(listNode != null){
            this.printListFromTailToHead(listNode.next);
            res.add(listNode.val);
        }
        return res;
    }
}
