//Problem2.java
public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        // This method should insert a new node with the given value at the specified position
        // If the position is out of bounds, insert the node at the end of the list

        ListNode newNode = new ListNode(val);
        if (position == 1 || head == null) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentPosition = 1;

        while (current.next != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
