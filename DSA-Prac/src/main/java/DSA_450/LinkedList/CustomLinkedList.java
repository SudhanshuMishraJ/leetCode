package DSA_450.LinkedList;

public class CustomLinkedList {

    ListNode head;

    public void linkedListInsertionAtHead(int value) {
        ListNode newNode = new ListNode(value);
        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
    }

    public void linkedListInsertionAtTail(int valueAtTail) {
        ListNode newNode = new ListNode(valueAtTail);
        if(head == null){
            head = newNode;
        }
        else{
            ListNode currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
    }
    public void linkedListInsertion(int position, int value) {
        ListNode newNode = new ListNode(value);
        if(head == null){
            head = newNode;
        }
        else if(position == 0){
            linkedListInsertionAtHead(value);
        }
        else{
            ListNode currentNode = head;
            for(int index =0; index < position-1; index++){
                currentNode = currentNode.next;
            }
            newNode.next = currentNode.next;
            currentNode.next = newNode;
        }
    }

    public void displayLinkedList() {
        ListNode newNode = new ListNode();
        if(head == null){
            head = newNode;
            System.out.print("List is empty");
        }
        else{
            ListNode currentNode = head;
            while(currentNode.next != null){
                currentNode = currentNode.next;
                System.out.print(currentNode.val+" ");
            }
        }
    }

}
