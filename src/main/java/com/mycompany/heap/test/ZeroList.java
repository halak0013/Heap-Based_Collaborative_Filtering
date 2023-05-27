//Bisimillahirrahmanirrahim
package com.mycompany.heap.test;

public class ZeroList<E> {
    Node<E> root;
    private int count = 0;

    public void insertWZ(int data) {
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
        //refsreshIndex();

    }



    public Node<E> insert(E data) {
        Node<E> result = new Node<>(data, count);
        if (root == null)
            root = result;
        else {
            Node<E> current = root;
            while (current.next != null) {
                current = current.next;
            }
            current.next = result;
        }
        count++;
        refsreshIndex();
        return result;
    }

    public void deleteMin() {
        if (root == null) {
            return;
        }
        Node<E> current = root;
        Node<E> currentB = root;
        Node<E> min = root;
        Node<E> minP = root;
        Node<E> r=root;
        if (root.data instanceof Integer || root.data instanceof Double) {
            while (current != null) {
                if (Double.parseDouble(min.data + "") > Double.parseDouble(current.data + "")) {
                    min = current;
                    minP = currentB;
                }
                currentB = current;
                current = current.next;
            }
            System.out.println(min.data + " " + root.data);
            if (min.data.equals(root.data))
            root = root.next;
            else
                minP.next = min.next;
        } else if(root.data instanceof Distance){
            while (current != null) {
            System.out.println("hatalı mı");
                if (((Distance)min.data).compareTo((Distance)current.data) > 0) {
                    min = current;
                    minP = currentB;
                }
                currentB = current;
                current = current.next;
            }
            System.out.println(min.data + " " + root.data);
            if (min.data.equals(root.data))
            root = root.next;
            else
                minP.next = min.next;
        }
        else
            System.out.println("Lütfen sayı sitemli liste oluşturunuz");
        refsreshIndex();
    }

    void refsreshIndex(){
        Node<E> c = root;
        int i=0;
        while(c!=null){
            c.index = i++;
            c=c.next;
        }
    }

    public void print() {
        Node<E> current = root;
        while (current != null) {
            System.out.print(current.data + " " + current.index + " - ");
            current = current.next;
        }
        System.out.println();
    }

    public void setIndex(int i){
        this.count = i;
    }

    public static void main(String[] args) {
        ZeroList<Integer> z1 = new ZeroList<>();
        ZeroList<Integer> z2 = new ZeroList<>();
        ZeroList<Integer> z3 = new ZeroList<>();
        ZeroList<Double> z4 = new ZeroList<>();
        CosSimilarity cs = new CosSimilarity();
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

        z3.insert(1);
        z3.insert(8);
        z3.insert(6);
        z3.insert(3);
        z3.insert(8);

        z3.print();
        z3.deleteMin();
        z3.print();

        z4.insert(1.3);
        z4.insert(1.6);
        z4.insert(1.7);
        z4.insert(1.2);
        z4.insert(1.5);
        z4.insert(1.0);

        z4.print();
        z4.deleteMin();
        z4.print();

        ZeroList<Distance> z5 = new ZeroList<>();

        z5.insert(new Distance(0, 12));
        z5.insert(new Distance(0, 13));
        z5.insert(new Distance(0, 17));
        z5.insert(new Distance(0, 14));
        z5.insert(new Distance(0, 11));
        z5.print();
        z5.deleteMin();
        z5.print();

        // z2.print();

        // system.out.println(cs.calculateCosSim(z1, z2));
    }
}
