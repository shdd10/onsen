package _21_MergeTwoSortedLists;

public class MergeTwoSortedLists {

  public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    ListNode dummy = new ListNode(-1);
    ListNode cur = dummy;
    while (list1 != null && list2 != null) {
      if (list1.val < list2.val) {
        cur.next = new ListNode(list1.val);
        list1 = list1.next;
      } else {
        cur.next = new ListNode(list2.val);
        list2 = list2.next;
      }
      cur = cur.next;
    }
    if (list1 == null) {
      cur.next = list2;
    } else {
      cur.next = list1;
    }
    return dummy.next;
  }

}
