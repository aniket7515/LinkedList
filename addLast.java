package LinkedList;

public class addLast {

    public static class Node{
        int data;
        Node next;

    }

    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        // to create a function for adding last in Linked List

        void addLast(int val){
            Node temp=new Node;
            temp.data=val;
            temp.next=null;
            if(size==0){
                head = tail =temp;
            }else{
                tail.next =temp;
                tail=temp;
            }
            size++;
        }
    }




    public static void main(String[] args) {

    }
}
