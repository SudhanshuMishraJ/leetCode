package DSA_450.LinkedList;

import java.util.Scanner;

public class ListNode {
    protected ListNode next;
    protected int val;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(ListNode next, int val) {
        this.next = next;
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
