package medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import medium.AddTwoNumbers.ListNode;

class AddTwoNumbersTest {

	private ListNode createList(int... vals) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        for (int val : vals) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    private int[] toArray(ListNode node) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    public void testDifferentLengths() {
        // 9 9 9 9  -> 9999
        //     1 1  ->   11
        // result = 0 1 0 1  (10010)
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = createList(9, 9, 9, 9);
        ListNode l2 = createList(1, 1);
        ListNode res = atn.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 1, 0, 0, 1}, toArray(res));
    }

    @Test
    public void testCarryProducesNewNode() {
        // 5 -> 5   (55)
        // 5 -> 5   (55)
        // sum = 110 → list should be 0 → 1 → 1
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = createList(5, 5);
        ListNode l2 = createList(5, 5);
        ListNode res = atn.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 1, 1}, toArray(res));
    }

    @Test
    public void testAllZeros() {
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = createList(0);
        ListNode l2 = createList(0, 0, 0);
        ListNode res = atn.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{0, 0, 0}, toArray(res));
    }

    @Test
    public void testSingleDigitNoCarry() {
        // 3 + 4 = 7
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = createList(3);
        ListNode l2 = createList(4);
        ListNode res = atn.addTwoNumbers(l1, l2);
        assertArrayEquals(new int[]{7}, toArray(res));
    }

    @Test
    public void testLongLists() {
        // 1 2 3 4 5 6 7 8 9 (987654321)
        // 9 8 7 6 5 4 3 2 1 (123456789)
        AddTwoNumbers atn = new AddTwoNumbers();
        ListNode l1 = createList(1,2,3,4,5,6,7,8,9);
        ListNode l2 = createList(9,8,7,6,5,4,3,2,1);
        ListNode res = atn.addTwoNumbers(l1, l2);
        // Expected: 0 1 1 1 1 1 1 1 1  (1111111110)
        assertArrayEquals(new int[]{0,1,1,1,1,1,1,1,1,1}, toArray(res));
    }

}
