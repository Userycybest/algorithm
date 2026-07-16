public class reverseLinkedList_test {
    public static void main(String[] args) {
        ReverseLinkedList.ListNode first = new ReverseLinkedList.ListNode(6);
        ReverseLinkedList.ListNode second = new ReverseLinkedList.ListNode(7);
        ReverseLinkedList.ListNode third = new ReverseLinkedList.ListNode(8);
        ReverseLinkedList.ListNode forth = new ReverseLinkedList.ListNode(9);
        first.next = second;
        second.next = third;
        third.next = forth;

        ReverseLinkedList solution = new ReverseLinkedList();
        ReverseLinkedList.ListNode newHead = solution.reverseList(first);

        printList(newHead);
    }

    private static void printList(ReverseLinkedList.ListNode head) {
        ReverseLinkedList.ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            System.out.print(current.next == null ? " -> null" : " -> ");
            current = current.next;
        }
        System.out.println();
    }
}
