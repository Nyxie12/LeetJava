public class ListNode {
    int val; // Data field for the node's value
    ListNode next; // Reference to the next node

    // Constructor to initialize a node with a value
    public ListNode(int val) {
        this.val = val;
        this.next = null; // Initially, the next node is null
    }

    // Optional: Constructor to initialize with both value and next node
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}