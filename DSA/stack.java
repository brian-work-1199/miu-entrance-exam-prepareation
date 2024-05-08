package DSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class stack {
    //stack = LIFO data structure, last in first out
    // store object as a sort of 'vertical tower'
    // 5 method:
    // push() - add object to the top
    // pop() - remove object from the top
    //
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Minecraft");
//        stack.push("Skyrim");
//        stack.push("Doom");
//        stack.push("Borderland");
//        stack.push("FFVIIS");
//
//        System.out.println(stack.size());
//
//        System.out.println(stack.peek());
//        System.out.println(stack.search("Skyrim"));
//
//        stack.pop();

        System.out.println(stack.size());
//        System.out.println(stack.search("FFVIIS"));

//        Queue<String> queue = new LinkedList<String>();
//        LinkedList<String> linkedList = new LinkedList<>();
//
//        linkedList.push("A");
//        linkedList.push("B");
//        linkedList.push("C");
//        linkedList.pop();

//        linkedList.offer("A");
//        linkedList.offer("B");
//        linkedList.offer("C");
//        linkedList.poll();
//        ArrayList<Integer> arrray = new ArrayList<>();
//        int[] aray = new int[3];

    }
}
