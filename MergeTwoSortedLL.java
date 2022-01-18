

// given two Sorted LL and merge them in such a way that the given LL is a sorted LL

// Only function


void addLast(int val) {
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }

            size++;
        }

        public static LinkedList mergeTwoSortedLists(LinkedList l1, LinkedList l2) {
            // write your code hered
            Node one=l1.head;
            Node two=l2.head;
            
            LinkedList res= new LinkedList();
            
            while(one != null && two!=null){
                if(one.data < two.data){
                    res.addLast(one.data);
                }else{
                    res.addLast(two.data);
                    two=two.next;
                }
            }
            while(one !=null){
                res.addLast(one.data);
                one=one.next;
            }
            while(two !=null){
                res.addLast(two.data);
                two=two.next;
            }
            return res;
        }
