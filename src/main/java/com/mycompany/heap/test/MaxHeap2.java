package com.mycompany.heap.test;

import javax.swing.DefaultListModel;

/**
 *
 * @author Casper
 */
public class MaxHeap2<T extends Comparable<T>> {

    ZeroList<T> heap;
    int size;
    int capacity;
    // [[0.6,vector1],[0.78,98]]
//1 2 3 4 5 6 7 8 index
//6 8 2 4 3 8 1 2 uzaklık
//3 8 1 2

// ZeroList<Integer>
    public MaxHeap2(int capacity) {
        heap = new ZeroList<>();
        size = 0;
        this.capacity = capacity;
    }

    Node<T> parent(Node<T> n) { // 0 1 2 [3] 4 
        //heap.print();
        Node<T> tmp=heap.root;
        //System.out.println(n.index);
        int idx=(n.index - 1) / 2;
        //System.out.print("parent kısmı");
        //heap.print();
        while(tmp!=null){
            //System.out.println("idx "+idx+" "+" tmp.index " +tmp.index);
            if(idx==tmp.index)
                break;
            tmp=tmp.next;
        }
        return tmp;
    }
            //    idx         max
    void swap(Node<T> n1, Node<T> n2) {
        T temp= n1.data;
        n1.data = n2.data;
        n2.data = temp;
    }

    private boolean isBigger(Node<T> n1, Node<T> n2){
        if (n1.data instanceof Integer || n2.data instanceof Double){
            return (Double.parseDouble(n1.data + "") > Double.parseDouble(n2.data + ""));
        }else if(n1.data instanceof Distance){
            return (((Distance)n1.data).compareTo((Distance)n2.data)>0);
        }
        else{
            System.out.println("Lütfen sayı sitemli liste oluşturunuz");
            return false;
        }
        
    }

    void insert(T data) {
        if (size < this.capacity) {
            
            Node<T> cur_n = heap.insert(data);
            size++;

            while (isBigger(cur_n, parent(cur_n))) {
                swap(cur_n, parent(cur_n));
                cur_n=parent(cur_n);
            }
//! gelen elemanın currentı topupHeapify kontol edilmesi gerekebilir
        } else {
            System.out.println("Heap is full!!!");

            //! en küçük elemanı bulup heapiy fonksiyonuna göndereceğiz.
            //! for döngüsünde dizinin içinde bulup döndürebiliriz.
            /* 
            int toplam_kat = (int) (Math.log(size-1) / Math.log(2)) + 1;
            int alt_index = (int)(Math.pow(2, toplam_kat-1)) - 1;
            int min_index = alt_index;
            */
            Node<T> cur_n = heap.insert(data);
            heap.deleteMin();
            topupHeapify(cur_n);


        }
        //heap.print();
    }

    void topupHeapify(Node<T> n) {
        while(n.index!=0 && isBigger(n, parent(n))){
            swap(n, parent(n));
            n = parent(n);
        }
    }  

    void print() {

        /* for (int i = 0; i <= parent(size - 1); i++) {
            int level = (int) (Math.log(i + 1) / Math.log(2));

            System.out.println("Level:" + level);

            System.out.println("    Parent: " + heap[i]);

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

        } */
        heap.print();

    }


    public static void main(String[] args) {
        //MaxHeap<Integer> mheap=new MaxHeap<>(10);
       //! insert ve print fonksiyonlarını yeniden düzelt. 

        /* 
        mheap.insert(5);
        mheap.insert(3);
        mheap.insert(4);
        mheap.insert(25);
        mheap.insert(45);
        //System.out.println(mheap.heap[2]);
        mheap.print();
        */



        MaxHeap2<Integer> mheap2=new MaxHeap2<>(5);
        mheap2.insert(5);
        mheap2.insert(3);
        mheap2.insert(6);
        mheap2.insert(25);
        mheap2.insert(47);
        mheap2.insert(45);
        mheap2.insert(4);
        //System.out.println(mheap.heap[2]);
        mheap2.print();
        
    }
}
