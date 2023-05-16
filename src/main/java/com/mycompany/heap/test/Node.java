//Bismillahirrahmanirrahim
package com.mycompany.heap.test;

public class Node<T> {
    T data;
    Node<T> next;
    int index;

    Node(T data,int index){
        this.data=data;
        this.index=index;
    }

    Node(T data){
        this.data=data;
    }

}
