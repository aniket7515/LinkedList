// Middle of a Linked List
//without using a size

        public int mid(){
              Node s=head;
              Node f=head;

              while(f.next!=null && f.next.next== null){
                  s=s.next;
                  f=f.next.next;
              }
               return s.data;
        }


