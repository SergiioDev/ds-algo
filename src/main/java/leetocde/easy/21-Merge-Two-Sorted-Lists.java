package leetocde.easy;

class MergeTwoLinkedList {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummyNode = new ListNode();
        ListNode h = dummyNode;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                h.next = list1;
                list1 = list1.next;
            } else {
                h.next = list2;
                list2 = list2.next;
            }
            h = h.next;

        }

        if (list1 != null) {
            h.next = list1;
        }

        if (list2 != null) {
            h.next = list2;
        }

        return dummyNode.next;
    }

    private static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
