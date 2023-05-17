package DSA_450.LinkedList;

import java.util.Scanner;

public class LinkedListRunner {


    public static void main(String[] args) {

        CustomLinkedList list = new CustomLinkedList();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 99 to exit playing with custom linked list");
        int gameValue = sc.nextInt();
        while (gameValue != 99) {
            System.out.println("Where you want to insert your value?\n Press 1 for insertion at head. \n Press2 for insertion at tail. \n Press any number for insertion at specific position:");
            int insertionPosition = sc.nextInt();
            //insert elements into empty linked list
            if (insertionPosition == 1) {
                //insertion at head
                System.out.println("Enter the value you want to enter at head:");
                int valueAtHead = sc.nextInt();
                list.linkedListInsertionAtHead(valueAtHead);
            } else if (insertionPosition == 2) {
                //insertion at Tail
                System.out.println("Enter the value you want to enter at tail:");
                int valueAtTail = sc.nextInt();
                list.linkedListInsertionAtTail(valueAtTail);
            } else {
                //Insertion at given position
                System.out.println("Enter he position and the value you want to enter the position :");
                int position = sc.nextInt();
                int value = sc.nextInt();
                list.linkedListInsertion(position, value);
            }

            //insertion after a given node

            //searching

            //sorting

            //deletion of a node

            //deletion of list

            System.out.println("Press 99 to exit playing with custom linked list");
            gameValue = sc.nextInt();
        }

        //Traversal of all the values
        list.displayLinkedList();
    }

}
