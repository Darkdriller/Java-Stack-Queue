
public class Main {

    public static void main(String[] args) {
        SortedLinkedList LL = new SortedLinkedList();
        LL.add(70);
        LL.add(56);
        LL.add(30);

        System.out.println("LinkedList before Popping: ");
        LL.print();
//        System.out.println("First Element Popped: " + LL.popFirst());
        System.out.println("Last Element Popped: " + LL.popLast());
        System.out.println("LinkedList after Popping: ");
        LL.print();

        System.out.println("Linked List Searching for node 30: "+ LL.search(30));

        Stack S = new Stack();
        for (int i : new int[]{70, 30, 56}) {
            S.push(i);
        }
        System.out.println("Top of Stack is: " + S.peek());
        S.pop();
        System.out.println("Top of Stack is: " + S.peek());
        S.pop();
        System.out.println("Top of Stack is: " + S.peek());
        S.pop();

        Queue q = new Queue();
        for (int i : new int[]{56, 30, 70}) {
            q.enqueue(i);
        }
        q.print();
        System.out.println("Front of Queue is: " + q.dequeue());
        System.out.println("Front of Queue is: " + q.dequeue());
        System.out.println("Front of Queue is: " + q.dequeue());
    }

}
