// Function for oddEven Linkedlist

public void oddEven(){
        LinkedList odd=new LinkedList();
        LinkedList even=new LinkedList();
        
        while(this.size>0){
            int val=this.getFirst();
            this.removeFirst();
            
            if(val%2==0){
                even.addLast(val);
            }else{
                odd.addLast(val);
            }
        }
        odd.tail.next=even.head;
        this.head=odd.head;
        this.tail=even.tail;
        this.size=odd.size+even.size;
    }
