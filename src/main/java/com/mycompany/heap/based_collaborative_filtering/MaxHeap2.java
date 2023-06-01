package com.mycompany.heap.based_collaborative_filtering;


public class MaxHeap2<T extends Comparable<T>> {

    ZeroList<T> heap;
    int size;
    int capacity;

    public MaxHeap2(int capacity) {
        heap = new ZeroList<>();
        size = 0;
        this.capacity = capacity;
    }

    Node<T> parent(Node<T> n) {
        Node<T> tmp=heap.root;
        int idx=(n.index - 1) / 2;
        while(tmp!=null){
            //System.out.println("idx "+idx+" "+" tmp.index " +tmp.index);
            if(idx==tmp.index)
                break;
            tmp=tmp.next;
        }
        return tmp;
    }

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

    void insert(T h_data) {
        if (size < this.capacity) {
            
            Node<T> cur_n = heap.insert(h_data);
            size++;

            while (isBigger(cur_n, parent(cur_n))) {
                swap(cur_n, parent(cur_n));
                cur_n=parent(cur_n);
            }
        } else {
            //System.out.println("Heap is full!!!");
            Node<T> cur_n = heap.insert(h_data);
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
        heap.print();
    }


    public static void main(String[] args) {

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
