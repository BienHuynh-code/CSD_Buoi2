package mylinkedlist;

import java.util.LinkedList;

public class MyLinkedLinst {
    private Node head;
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLa'st(int data){
        Node newNode = new Node(data);
        Node temp = head;
        if(head == null) {
            head = newNode;
            return;
        }
        Node temp = head; //tao ra ban sao cho head
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;     
    }

    public void add(int data, int index){
        Node newNode = new Node();
        if(index < 0){
            return;
        }
        if(index==0){
            addFirst(data);
        } else {
            Node temp = head;
            for(int i = 0; i < index; i++) {
                temp = temp.next;
            }
            Node nextNode = temp.next;
            temp.next = newNode;
            newNode.next = nextNode;

        }
    // }
    // public static void main(String[] args) {
    //     MyLinkedLinst linkedLinst = new MyLinkedLinst();
    //     linkedLinst.addFirst(1);
    //     linkedLinst.addFirst(2);
    //     linkedLinst.addFirst(3);
    // }
     public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);
        LinkedList.length();
        System.out.println();
        System.out.printf("Display:");
        LinkedList.DisplayLinkedList();
        System.out.println();
        LinkedList.deletefirst();
    }

}
