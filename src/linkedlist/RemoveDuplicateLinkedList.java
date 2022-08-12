package linkedlist;

public class RemoveDuplicateLinkedList {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current = head;
		while (current != null && current.next != null) {
			if (current.next.val == current.val) {
				current.next = current.next.next;
			} else {
				current = current.next;
			}
		}
		return head;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(9,
				new ListNode(8, new ListNode(8, new ListNode(7, new ListNode(7, new ListNode(5, new ListNode(4)))))));
		RemoveDuplicateLinkedList rdl = new RemoveDuplicateLinkedList();
		printResult(rdl.deleteDuplicates(list));
	}

	private static void printResult(ListNode addTwoNumbers) {
		while (addTwoNumbers != null) {
			System.out.print(addTwoNumbers.val + ", ");
			addTwoNumbers = addTwoNumbers.next;
		}
		System.out.println();
	}
}