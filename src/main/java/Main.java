public class Main {

    public static void main(String[] args) {
        LinkedList LL = new LinkedList();
        LL.add(70);
        LL.add(30);
        LL.add(56);

        LinkedList LL2 = new LinkedList(70);
        LinkedList LL3 = new LinkedList(30);
        LinkedList LL4 = new LinkedList(56);

        LL2.append(LL3);
        LL2.append(LL4);


        //        LL.print();
        LL2.print();
    }

}
