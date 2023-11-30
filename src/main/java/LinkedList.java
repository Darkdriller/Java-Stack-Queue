import org.w3c.dom.traversal.NodeFilter;

public class LinkedList <T>{
        private Node<T> head;

        public LinkedList(T data){
            this.head = new Node<>(data);
        }
        public LinkedList(){
            this.head = null;
        }

        public Node<T> getHead(){
            return this.head ;
        }
        public void add(T data){
                Node<T> newNode = new Node<>(data);

                if (this.head == null){
                    this.head = newNode;
                }
                else{
                    Node<T> current = this.head;
                    while(current.getNext() != null){
                        current = current.getNext();
                    }
                    current.setNext(newNode);
                }
            }
        public void addAfter(T data, T key){
            Node<T> newNode = new Node<>(data);

            if (this.head == null){
                System.out.println("Empty List, Key Not Found");
            }
            else{
                Node<T> current = this.head;
                while(current.getData() != key && current.getNext()!= null){
                    current = current.getNext();
                }
                Node<T> nextNode = current.getNext();
                current.setNext(newNode);
                current.getNext().setNext(nextNode);
            }
        }
        public void append(LinkedList<T> LL){
            if (this.head == null){
                this.head = LL.getHead();
            }
            else{
                Node<T> current = this.head;
                while(current.getNext() != null){
                    current = current.getNext();
                }
                current.setNext(LL.getHead());
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
