/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heap.test;

import javax.swing.DefaultListModel;

/**
 *
 * @author Casper
 */
public class MaxHeap<T extends Comparable<T>> {

    T[] heap;
    int size;
    // [[0.6,vector1],[0.78,98]]
//1 2 3 4 5 6 7 8 index
//6 8 2 4 3 8 1 2 uzaklık
//3 8 1 2

// ZeroList<Integer>
    public MaxHeap(int capacity) {
        heap = (T[]) new Comparable[capacity];
        size = 0;
    }

    int parent(int idx) {
        return (idx - 1) / 2;
    }

    void swap(int idx_1, int idx_2) {
        T temp = heap[idx_1];
        heap[idx_1] = heap[idx_2];
        heap[idx_2] = temp;
    }

    void insert(T data) {
        int current;
        if (size < heap.length) {

            heap[size] = data;
            current = size++;

            while (heap[current].compareTo(heap[parent(current)]) > 0) {
                swap(current, parent(current));
                current = parent(current);
            }
//! gelen elemanın currentı topupHeapify kontol edilmesi gerekebilir
        } else {
            System.out.println("Heap is full!!!");
            
            //! en küçük elemanı bulup heapiy fonksiyonuna göndereceğiz.
            //! for döngüsünde dizinin içinde bulup döndürebiliriz.
            int toplam_kat = (int) (Math.log(size-1) / Math.log(2)) + 1;
            int alt_index = (int)(Math.pow(2, toplam_kat-1)) - 1;
            int min_index=alt_index;
            for (int i = alt_index; i < heap.length; i++) {
                if(heap[i].compareTo(heap[min_index]) < 0){ 
                    min_index = i;
                }
            }
            heap[min_index] = data;
            topupHeapify(min_index);
        }
    }


    void topupHeapify(int idx) {
        int left = 2*idx + 1;
        int right = 2*idx + 2;

        int max = idx;
        if (left < size && heap[left].compareTo(heap[max]) > 0) {
            max = left;
        }
        if (right < size && heap[right].compareTo(heap[max]) > 0) {
            max = right;
        }
        if (max!= idx) {
            swap(idx, max);
            topupHeapify(max);
        }
    }  



    void print() {

        for (int i = 0; i < parent(size - 1); i++) {
            int level = (int) (Math.log(i + 1) / Math.log(2));

            System.out.println("Level:" + level);

            System.out.println("    Parent:" + heap[i]);

            int left = 2 * i + 1;
            int right = 2 * i + 2;

            if (left < size) {
                System.out.println("\t\tLeft Child " + heap[left]);
            } else {
                System.out.println("\t\tLeft child: - ");
            }

            if (right < size) {
                System.out.println("\t\tRight Child " + heap[right]);
            } else {
                System.out.println("\t\tRight child: - ");
            }
            System.out.println(" ");

        }

    }

    public void addEl(DefaultListModel<String> dlm) {
        for (int i = 0; i < heap.length; i++) {
            //System.out.println(i + "index" + reco.heap[i].vektor.root.data);
            dlm.addElement(((Distance)heap[i]).vektor.root.data+"");
            //reco.heap[i].vektor.root.data.toString()
        }
    }

    public static void main(String[] args) {
        MaxHeap<Integer> mheap=new MaxHeap<>(10);
       //! insert ve print fonksiyonlarını yeniden düzelt. 
        mheap.insert(5);
        mheap.insert(3);
        mheap.insert(4);
        mheap.insert(25);
        mheap.insert(45);
        //System.out.println(mheap.heap[2]);
        mheap.print();


        MaxHeap<Integer> mheap2=new MaxHeap<>(5);
        mheap2.insert(5);
        mheap2.insert(3);
        mheap2.insert(4);
        mheap2.insert(25);
        mheap2.insert(47);
        mheap2.insert(45);
        mheap2.insert(4);
        //System.out.println(mheap.heap[2]);
        mheap2.print();
    }
}
