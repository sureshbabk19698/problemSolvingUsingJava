package linkedlist;

public class ReverseListNode {

	public static ListNode reverseListByIteration(ListNode head) {
		ListNode previous = null;
		ListNode current = head; // 1, 2, 3, 4, 5, 6, 7
		while (current != null) {
			ListNode nextElement = current.next; // 2
			current.next = previous; // null
			previous = current; // 1 // 2
			current = nextElement; // 2
		}
		return previous;
	}

	public static ListNode reverseListRecurssion(ListNode head, ListNode previous) {
		ListNode current = head; // 1, 2, 3, 4, 5, 6, 7
		if (current != null) {
			ListNode nextElement = current.next; // 2
			current.next = previous; // null
			previous = current; // 1 // 2
			current = nextElement; // 2
			return reverseListRecurssion(current, previous);
		}
		return previous;
	}

	public static void main(String[] args) {
		ListNode list = new ListNode(1,
				new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(6, new ListNode(7)))))));
		printResult(reverseListByIteration(list));
		printResult(reverseListRecurssion(list, null));
	}

	private static void printResult(ListNode addTwoNumbers) {
		while (addTwoNumbers != null) {
			System.out.print(addTwoNumbers.val + ", ");
			addTwoNumbers = addTwoNumbers.next;
		}
		System.out.println();
	}
}