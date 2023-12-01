public class SortedLinkedList <T extends Comparable<T>>{
        private Node<T> head;

        public SortedLinkedList(T data){
            this.head = new Node<>(data);
        }
        public SortedLinkedList(){
            this.head = null;
        }

        public Node<T> getHead(){
            return this.head ;
        }

        public void add(T data) {
            Node<T> newNode = new Node<>(data);

            if (head == null || data.compareTo(head.getData()) < 0) {
                newNode.setNext(head);
                head = newNode;
            } else {
                Node<T> current = head;
                Node<T> prev = null;
                while (current != null && data.compareTo(current.getData()) >= 0) {
                    prev = current;
                    current = current.getNext();
                }
                newNode.setNext(current);
                prev.setNext(newNode);
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

        public T popFirst(){
            if (head == null) {
                // List is empty, nothing to pop
                return null;
            }

            T poppedData = head.getData();
            head = head.getNext();
            return poppedData;
        }
        public T popLast() {
            if (head == null) {
                // List is empty, nothing to pop
                return null;
            }

            if (head.getNext() == null) {
                // List has only one element, so pop the head
                T poppedData = head.getData();
                head = null;
                return poppedData;
            }

            Node<T> current = head;
            Node<T> prev = null;

            while (current.getNext() != null) {
                prev = current;
                current = current.getNext();
            }

            T poppedData = current.getData();
            prev.setNext(null);

            return poppedData;
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

        public Boolean search(T target) {
            Node<T> current = head;
            while (current != null) {
                if (current.getData().equals(target)) {
                    // Node with the target value found
                    return true;
                }
                current = current.getNext();
            }
            // Target value not found in the list
            return false;
        }
}
