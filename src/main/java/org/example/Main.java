package org.example;

public class Main {
    public static void main(String[] args) {

/*        MyQueue list = new MyQueue();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.display();
        System.out.println("list.size() = " + list.size());
        System.out.println("list.peek() = " + list.peek());
        System.out.println("list.size() = " + list.size());
        System.out.println("list.poll() = " + list.poll());
        list.display();
        System.out.println("list.size() = " + list.size());
        list.clear();
        System.out.println("list.size() = " + list.size());*/

        MyQueueArr list = new MyQueueArr();
        System.out.println("list.size() = " + list.size());
        list.add(100);
        System.out.println("list.size() = " + list.size());
        list.add("One Hundred");
        list.add("******");
        list.add("Ten");
        list.add("Cow");
        list.display();
        System.out.println("list.size() = " + list.size());
        System.out.println("list.poll() = " + list.poll());
        list.display();
        list.clear();
        list.display();

    }
}