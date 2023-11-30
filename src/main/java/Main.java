public class Main {

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.add(70);
        LL.add(56);
        LL.addAfter(30,70);

        System.out.println("LinkedList before Popping: ");
        LL.print();
        System.out.println("First Element Popped: " + LL.popFirst());
        System.out.println("LinkedList after Popping: ");
        LL.print();
    }

}
