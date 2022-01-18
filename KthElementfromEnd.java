// Function 

// In this question constartint were not to use size abd solve it in single iteration
        public int KthFromLast(int K){
            Node s=head;
            Node f=head;

            for(int i=0;i<K;i++){
                f=f.next;
            }

            while(f!= tail){
                s=s.next;
                f=f.next;
            }

            return s.data;


        }

