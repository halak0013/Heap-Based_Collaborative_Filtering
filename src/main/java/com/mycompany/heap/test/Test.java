/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heap.test;

/**
 *
 * @author Casper
 */
public class Test {
    public static void main(String[] args) {
        MaxHeap2<Integer> maxHeap = new MaxHeap2(5);

        maxHeap.insert(5);
        maxHeap.insert(4);
        maxHeap.insert(3);
        maxHeap.insert(2);
        maxHeap.insert(1);


        maxHeap.print();
        /*
        System.out.println("Minimum : " + minHeap.deleteMin() + "\n");
        
        
        // decrease key
        System.out.println("after decrease key method :");
        //minHeap.decreaseKey(72, 70);
        System.out.println();

        minHeap.print();
        System.out.println("Minimum : " + minHeap.deleteMin());
*/
    }
}
