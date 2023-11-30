public class Main {

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.add(70);
        LL.add(56);
        LL.addAfter(30,70);

        System.out.println("LinkedList before Popping: ");
        LL.print();
//        System.out.println("First Element Popped: " + LL.popFirst());
        System.out.println("Last Element Popped: " + LL.popLast());
        System.out.println("LinkedList after Popping: ");
        LL.print();

        System.out.println("Linked List Searching for node 30: "+ LL.search(30));


    }

}
