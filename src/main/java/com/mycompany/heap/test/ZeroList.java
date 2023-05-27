//Bisimillahirrahmanirrahim
package com.mycompany.heap.test;

public class ZeroList<E extends Comparable <E>> {
    Node<E> root;
    private int count = 0;


    public int compareTo(ZeroList<E> other) {
        Node<E> currentThis = this.root;
        Node<E> currentOther = other.root;

        while (currentThis != null && currentOther != null) {
            int elementComparison = currentThis.data.compareTo(currentOther.data);
            if (elementComparison != 0) {
                return elementComparison;
            }
            currentThis = currentThis.next;
            currentOther = currentOther.next;
        }

        if (currentThis == null && currentOther == null) {
            return 0; // iki ZeroList'te aynı elemanlara sahip ise
        } else if (currentThis == null) {
            return -1; //  ZeroList kısa ise
        } else {
            return 1; //  ZeroList uzun ise
        }
    }

         public void insert(int data) {
        // ? 0 1 0 0 1 1
        // ? 0 1 2 3 4 5
        if (data != 0) {
            if (root == null)
                root = new Node(data, count);
            else {
                Node<E> current = root;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(data, count);
            }
        }
        count++;
    }
    
/* public void insert(E data) {
        Node<E> newNode = new Node<>(data);

        if (root == null) {
            root = newNode;
        } else {
            Node<E> current = root;
            while (true) {
                if (data.compareTo(current.data) < 0) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                    current = current.left;
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }
            }
        }
    }*/
    

public void insert(E data) {
        if (data != null) {
            if (root == null)
            root = new Node<>(data);
        else {
            Node<E> current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new Node<>(data);
            } 

        }
        count++;
        
    } 

    
    

    public void print() {
        Node<E> current = root;
        while (current != null) {
            System.out.print(current.data + " " + current.index + " - ");
            current = current.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        ZeroList<Integer> z1 = new ZeroList<>();
        ZeroList<Integer> z2 = new ZeroList<>();
        CosSimilarity cs= new CosSimilarity();
        z1.insert(1);
        z1.insert(1);
        z1.insert(1);
        z1.insert(0);
        z1.insert(0);
        z1.insert(1);

        z2.insert(0);
        z2.insert(1);
        z2.insert(1);
        z2.insert(1);
        z2.insert(0);
        z2.insert(0);

        z1.print();
        z2.print();

        System.out.println(cs.calculateCosSim(z1, z2));
    }
}
