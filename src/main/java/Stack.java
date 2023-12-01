public class Stack<T extends Comparable<T>> {
    private LinkedList<T> stack;

    public Stack(){
        this.stack = new LinkedList<>();
    }
    public boolean isEmpty(){
        return this.stack.getHead() == null;
    }
    public int size(){
        return this.stack.len();
    }
    public void push(T data){
        this.stack.addFirst(data);
    }

    public T pop(){
        if (this.isEmpty()){
            return null;
        }
        return stack.popFirst();
    }

    public T peek(){
        if (isEmpty()){
            return null;
        }
        return stack.getHead().getData();
    }


}
