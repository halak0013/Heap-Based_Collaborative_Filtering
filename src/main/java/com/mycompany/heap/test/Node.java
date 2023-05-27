//Bismillahirrahmanirrahim
package com.mycompany.heap.test;

public class Node<T> {
    T data;
    Node<T> next;
   // Node<T> left;
   // Node<T> right;
    int index;

    Node(T data,int index){
        this.data=data;
        this.index=index;
     //   left = null;
     //   right = null;
        this.next = null;
    }

    Node(T data){
        this.data=data;
    }

}
