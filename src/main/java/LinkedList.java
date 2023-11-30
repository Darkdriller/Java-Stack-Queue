public class LinkedList <T>{
        private Node<T> head;

        public LinkedList(){
            this.head = null;
        }

        public void add(T data){
            Node<T> newNode = new Node<>(data);

            if (head == null){
                head = newNode;
            }
            else{
                Node<T> current = head;
                while(current.getNext() != null){
                    current = current.getNext();
                }
                current.setNext(newNode);
            }
        }

        public void print(){
            if (head ==  null){
                System.out.println("Empty");
            }
            else{
                Node<T> curr = head;
                while (curr != null) {
                    System.out.println(curr.getData());
                    curr = curr.getNext();
                }
            }
        }
}
