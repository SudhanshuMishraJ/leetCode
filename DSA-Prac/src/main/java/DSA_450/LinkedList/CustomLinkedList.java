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
        if(head == null){
            System.out.print("List is empty");
        }
        else{
            ListNode currentNode = head;
            while(currentNode.next != null){
                System.out.print(currentNode.val+" ");
                currentNode = currentNode.next;
            }
            System.out.print(currentNode.val+" ");
        }
    }

    public void searchValueInlinkedList(int searchValue) {
        if(head == null){
            System.out.print("List is empty. Nothing to search");
        }
        else{
            int index = 1;
            boolean flag = false;
            ListNode currentNode = head;
            while(currentNode.next != null){
                if(currentNode.val == searchValue) {
                    System.out.println("Element found " + searchValue + " at index " + (index-1));
                    flag = true;
                    break;
                }
                currentNode = currentNode.next;
                index++;
            }
            if(currentNode.val == searchValue && !flag) {
                System.out.println("Element found " + searchValue + " at index " + (index-1));
                flag = true;
            }
            if(!flag)
                System.out.println("Element "+searchValue+" not found");

        }
    }
    public void deleteNodeInlinkedList(int deletionIndex) {

        if(deletionIndex == 0)
            head = head.getNext();
        else{
            ListNode node = head;
            for (int i = 0; i < deletionIndex - 1; i++) {
                if(node.getNext() == null) {
                    System.out.println("Please insert index within the list index range");
                    return;
                }
                node = node.getNext();
            }
            node.setNext(node.getNext().getNext() == null ? null : node.getNext().getNext());
        }
        displayLinkedList();
    }

    public void deleteLinkedList() {
        this.head = null;
        displayLinkedList();
    }
}
