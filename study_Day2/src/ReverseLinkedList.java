/**
 * 题目：反转链表
 *
 * 给定单链表的头节点 head，请将链表反转并返回新的头节点。
 * 示例：1 -> 2 -> 3 -> null 变为 3 -> 2 -> 1 -> null
 *
 * 时间复杂度：O(n)，空间复杂度：O(1)
 */
public class ReverseLinkedList {

    /** 单链表节点。 */
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverseList(ListNode head) {
        // prev：current 前面的节点，也是已经反转部分的头节点。
        ListNode prev = null;
        // current：当前正在处理的节点。
        ListNode current = head;

        while (current != null) {
            // 必须先保存 next。改变 current.next 后，如果没有提前保存，
            // 就会失去通往尚未处理节点的路径。
            ListNode next = current.next;

            current.next = prev;
            prev = current;
            current = next;
        }

        // current 为 null 时，prev 指向反转后的新头节点。
        return prev;
    }
}
