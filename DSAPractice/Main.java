package DSAPractice;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList(3);

        list.prepend(2);
        list.prepend(1);
        list.append(4);
        list.append(5);
        list.printList();
        System.out.println(list.pop().data);
        System.out.println(list.popFirst().data);
        list.printList();
        System.out.println(list.get(2).data);
        System.out.println(list.insert(1, 10));
        list.printList();

    }
}
