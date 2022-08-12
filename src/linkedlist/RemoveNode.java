package linkedlist;

public class RemoveNode {
	public static ListNode removeElementsIteratively(ListNode head, int val) {
		ListNode previous = head;
		ListNode current = head;

		int i = 0;
		int j = 0;
		while (current != null) {
			i++;
			j++;
			if (current.val == val) {
				if (i == j) {
					head = head.next;
				}
				ListNode temp = current.next;
				current = temp;
				previous.next = current;
			} else {
				j++;
				previous = current;
				current = current.next;
			}
		}
		return head;
	}

	public static ListNode removeElementsRecursively(ListNode head, int val) {
		if (head == null)
			return null;
		ListNode newHead = removeElementsRecursively(head.next, val);
		if (head.val == val) {
			return newHead;
		} else {
			head.next = newHead;
			return head;
		}
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(9,
				new ListNode(9, new ListNode(8, new ListNode(7, new ListNode(9, new ListNode(5, new ListNode(4)))))));
//		printResult(removeElementsIteratively(head, 4));
//		head = new ListNode(9,
//				new ListNode(9, new ListNode(8, new ListNode(7, new ListNode(9, new ListNode(5, new ListNode(4)))))));
		printResult(removeElementsRecursively(head, 4));
	}

	private static void printResult(ListNode addTwoNumbers) {
		while (addTwoNumbers != null) {
			System.out.print(addTwoNumbers.val + ", ");
			addTwoNumbers = addTwoNumbers.next;
		}
		System.out.println();
	}
}
