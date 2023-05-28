//Bismillahirrahmanirrahim
package com.mycompany.heap.based_collaborative_filtering;

public class Node<T> {
    T data;
    Node<T> next;
    int index;
    int film_index;

    Node(T data,int index){
        this.data=data;
        this.index=index;
    }

    Node(T data){
        this.data=data;
    }

}
