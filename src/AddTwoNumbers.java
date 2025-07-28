/*
LeetCode Problem: Add Two Numbers
https://leetcode.com/problems/add-two-numbers/description/

There are two non-empty linked lists representing two positive integers.
The digits are stored in reverse order, and each of their nodes contains a single digit.
Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Example:
First linked list contains: [2 -> 4 -> 3]
Second linked list contains: [5 -> 6 -> 4]
Result = [7 -> 0 -> 8]

Basically,
Input: l1 = [2,4,3], l2 = [5,6,4]
Output: [7,0,8]
Explanation: 342 + 465 = 807

Constraints:

The number of nodes in each linked list is in the range [1, 100].
0 <= Node.val <= 9
It is guaranteed that the list represents a number that does not have leading zeros.
*/

class ListNode {
    int val;
    ListNode next;

    // Default constructor
    ListNode() {}

    ListNode(int val) { this.val = val; }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        // Testing return value
        return l1;
    }
}
