public class Node<T extends Comparable<T>>{
    private T data ;
    private Node<T> next ;

    public Node(T data){
            this.data = data;
            this.next = null;
    }

    public T getData(){
        return this.data;
    }

    public void setData(T newData){
        this.data = newData;
    }

    public Node<T> getNext(){
        return this.next;
    }

    public void setNext(Node<T> nextNode){
        this.next = nextNode;
    }


}
