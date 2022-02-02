
public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data=data;
            this.next=null;
        }
    }
    public void display(){
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.println("null");
    }
    public void length(){
        if(head==null){
            System.out.println(0);
        }

        ListNode temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        System.out.println(len);
    }
    // Insert a Node at beginning of singly LInkedlost

    public void insertFirst(int value){
        ListNode newNode=new ListNode(value);
        newNode.next=head;
        head=newNode;

    }
     // Insert a Node at last of singly Linked list

    public void insertLast(int value){
        ListNode newNode = new ListNode(value);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    public static void main(String[] args) {
        SinglyLinkedList ssl=new SinglyLinkedList();

        ssl.head=new ListNode(10);
        ListNode second=new ListNode(1);
        ListNode third=new ListNode(8);
        ListNode fourth=new ListNode(11);

        // Now we will connect them together to form a chain

        ssl.head.next=second;// 10-->1
        second.next=third; // 10-->1-->8
        third.next=fourth;// 10-->1-->8-->11-->null

        ssl.display();
        ssl.length();
        ssl.insertFirst(23);
        ssl.length();
        ssl.display();
        ssl.insertLast(33);
        ssl.display();


    }
}


