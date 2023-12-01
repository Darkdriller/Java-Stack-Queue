public class Queue<T extends Comparable<T>>{

    private LinkedList<T> queue;
    public Queue(){
     this.queue = new LinkedList<>();
    }
    public boolean isEmpty(){return this.queue.getHead() == null;}

    public void enqueue(T data){this.queue.append(new LinkedList<>(data));}

    public void print(){this.queue.print();}

    public T dequeue(){return this.queue.popFirst();}

}
