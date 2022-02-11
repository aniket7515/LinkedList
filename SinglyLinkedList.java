
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
    
    
    // Insert at given position

    public void insert(int position, int value){
        ListNode node=new ListNode(value);

        if(position==1){
            node.next=head;
            head=node;
        }else{
            ListNode previous=head;
            int count=1;

            while(count<position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=node;
            node.next=current;
        }
    }
    
    // Delete First Node
    public ListNode delteFirst(){
        if(head==null){
            return null;
        }
        ListNode temp= head;
        head=head.next;
        temp.next=null;
        return temp;
    }
    
    // Delete Last Node
    public ListNode deleteLast(){
        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        ListNode previous=null;

        while(current.next!=null){
            previous=current;
            current=current.next;

        }
        previous.next=null; // Break the chain
        return current;

    }
    
    // Delete a Node from a given position from a Singly Linked list
    public ListNode DeleteAtPosition(int position){
        if(position==1){
            head=head.next;
        }

            ListNode previous=head;
            int count=1;
            while(count < position-1){
                previous=previous.next;
                count++;
            }
            ListNode current=previous.next;
            previous.next=current.next;

            return current;




    }
    
    // Search an Element in a Singly Linkedlist
    public boolean searchElement(int searchKey){
        ListNode current=head;
        while(current!=null){
            if(current.data==searchKey){
                return true;
            }
            current=current.next;
        }return false;
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
        
        
        ssl.insert(2,31);
        ssl.display();
        
         System.out.println("After removing first");
        System.out.println(ssl.delteFirst().data);
        ssl.display();
        
        System.out.println("After Removing last Node");
        ssl.deleteLast();
        ssl.display();
        
         // Delete Node at a given position
        System.out.println("Deleteing a Node at a given position");
        ssl.insertFirst(53);
        ssl.insertFirst(29);
        ssl.display();
        ssl.DeleteAtPosition(2);
        ssl.display();
        
        
        // search an elemet in a singly linked list
        System.out.println("Searching a element in singly linked list");
        System.out.println( ssl.searchElement(29));






    }
}


