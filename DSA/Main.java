package DSA;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>("2");
        linkedList.append("3");
        linkedList.append("4");
        linkedList.append("5");
        linkedList.prepend("1");
        linkedList.prepend("0");
        System.out.println(linkedList.printList());
        System.out.println(linkedList.pop().data);
        System.out.println(linkedList.popFirst().data);
        System.out.println(linkedList.printList());
        System.out.println(linkedList.get(2).data);
        System.out.println(linkedList.remove(5));
        System.out.println(linkedList.insert(1, "11"));
        System.out.println(linkedList.printList());

//        DynamicArray dynamicArray = new DynamicArray(5);
//        dynamicArray.add(1);
//        dynamicArray.add(2);
//        dynamicArray.add(3);
//        dynamicArray.add(4);
//        dynamicArray.add(5);
//        dynamicArray.add(6);
//        dynamicArray.insert(0, 4);
//        dynamicArray.delete(6);
//        dynamicArray.delete(5);
//        dynamicArray.delete(4);
//        System.out.println(dynamicArray.toString());
//        System.out.println("search: " + dynamicArray.search(6));
//        System.out.println("size: " + dynamicArray.size);
//        System.out.println("capacity: " + dynamicArray.capacity);
//        System.out.println("empty: " + dynamicArray.isEmpty());

    }
}
