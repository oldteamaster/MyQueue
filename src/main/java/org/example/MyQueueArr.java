package org.example;

import java.util.Arrays;

public class MyQueueArr {
    private Object[] arr = new Object[] {};

    public void add(Object value){
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length -1] = value;
    }
    public void clear(){
        arr = new Object[] {};
    }
    public int size(){
        return arr.length;
    }
    public Object peek(){
        return arr[0];
    }
    public Object poll(){
        Object result = arr[0];
        arr = Arrays.copyOfRange(arr, 1, arr.length);
        return result;
    }
    public  void display(){
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
}
