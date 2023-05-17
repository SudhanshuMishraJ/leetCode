package DSA_450.LinkedList;

import java.util.Scanner;

public class ListNode {
    private ListNode next;
    private int val;
    private ListNode head;

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

    //Insertion in linked list
    public void linkedListInsertion() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value in list and press 99 to stop entering values into list:");
        int data = sc.nextInt();
        while(data != 99) {
            insertionNode(data);
            data = sc.nextInt();
        }
    }

    private void insertionNode(int data) {

        ListNode newNode = new ListNode(data);
        if(this.head == null){
            head = newNode;
        }
        else{
            ListNode currentNode = head;
            while(currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }
    }

    public void displayLinkedList() {

        if (head != null){
            ListNode currentNode = head;
            while ((currentNode.getNext() != null)) {
                System.out.print(currentNode.getVal()+"\t");
                currentNode = currentNode.getNext();
            }
            System.out.println(currentNode.getVal());
        }
    }

    public void linkedListInsertionAtHead() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to enter at the head:");
        int data = sc.nextInt();
        ListNode newNode = new ListNode(data);
        if(this.head == null){
            head = newNode;
        }
        else{

        }
    }
}
