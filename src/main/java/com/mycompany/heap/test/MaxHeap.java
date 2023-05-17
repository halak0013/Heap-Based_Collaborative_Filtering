/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heap.test;

/**
 *
 * @author Casper
 */
public class MaxHeap<T extends Comparable<T>> {
    T[] heap;
    int size;
    
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

        if (size < heap.length) {

            heap[size] = data;
            int current = size++;

            while (heap[current].compareTo(heap[parent(current)]) > 0) {
                swap(current, parent(current));
                current = parent(current);
            }

        } else {
            System.out.println("Heap is full!!!");
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
}
