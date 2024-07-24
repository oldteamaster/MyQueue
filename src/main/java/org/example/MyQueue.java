package org.example;

public class MyQueue {
    private Node nods;
    private int size;

    private static class Node{
        Object value;
        Node next;
        Node(Object value){
            this.value = value;
            this.next = null;
        }
    }
    public void add(Object value){//додає елемент в кінець
        Node newNode = new Node(value);
        if(nods == null){
            nods = newNode;
        }else{
            Node current = nods;
            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }
    public void clear(){//очищає колекцію
        nods = null;
        size = 0;
    }
    public int size(){//повертає розмір колекції
        return size;
    }
    public Object peek(){//повертає перший елемент з черги
        return nods.value;
    }
    public Object poll(){//повертає перший елемент з черги і видаляє його з колекції
        Object result = nods.value;
        nods = nods.next;
        size--;
        return result;
    }
public void display(){
        Node current = nods;
        while(current != null){
            System.out.print(current.value + " ");
            current = current.next;
        }
    System.out.println();
}

}
