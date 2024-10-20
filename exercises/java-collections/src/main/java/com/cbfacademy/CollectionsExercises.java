package com.cbfacademy;

import java.util.*;

public class CollectionsExercises {

    public LinkedList<Integer> useLinkedList() {
        // TODO: create an empty linked list
        //  - add 4 as the first element of the list
        //  - then add 5, 6, 8, 2, 9 to the list
        //  - add another 2 as the last element of the list
        //  - add 4 as the 3rd element of the list
        //  - invoke the method element() on the list and print the result on the screen
        //  - return the list

        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(2);
        list.add(9);
        list.addLast(2);
        list.add(2, 4);

        System.out.print(list.element());
        return list;


    }

    public Stack<Integer> useStack() {
        // TODO: create an empty stack
        //  - add 5, 6, 8, 9 to the stack
        //  - print the first element of the stack on the screen
        //  - print the last element of the stack on the screen
        //  - invoke the method pop() on the stack and print the result on the screen
        //  - invoke the push(4) method on the stack
        //  - return the stack
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(9);

        System.out.print(stack.firstElement());
        System.out.print(stack.peek());
        System.out.print(stack.pop());

        stack.push(4);

        return stack;
    }

    public ArrayDeque<Integer> useArrayDeque() {
        // TODO: create an empty arrayDeque
        //  - add 5, 6, 8, 9 to the queue
        //  - print the first element of the queue on the screen
        //  - print the last element of the queue on the screen
        //  - invoke the method poll() on the queue and print the result on the screen
        //  - invoke the element() method on the queue and print the result on the screen
        //  - return the queue

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(6);
        deque.add(8);
        deque.add(9);

        System.out.print(deque.getFirst());
        System.out.print(deque.getLast());
        System.out.print(deque.poll());
        System.out.print(deque.element());

        return deque;
    }

    public HashMap<Integer, String> useHashMap() {
        // TODO: create an empty hash map
        //  - add {1, TypeScript} entry to the map
        //  - add {2, Kotlin} entry to the map
        //  - add {3, Python} entry to the map
        //  - add {4, Java} entry to the map
        //  - add {5, JavaScript} entry to the map
        //  - add {6, Rust} entry to the map
        //  - determine the set of keys from the map and print it on the screen
        //  - determine the set of values from the map and print it on the screen
        //  - determine whether the map contains "English" as a language and print the result on the screen
        //  - return the map

        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "TypeScript");
        map.put(2, "Kotlin");
        map.put(3, "Python");
        map.put(4, "Java");
        map.put(5, "JavaScript");
        map.put(6, "Rust");

        System.out.print(map.keySet());
        System.out.print(map.values());
        System.out.print(map.containsValue("English"));

        return map;

    }

    public String getName() {
        return "Collections Exercises";
    }
}
