//Bisimillahirrahmanirrahim
package com.mycompany.heap.test;

public class ZeroList<E> {
    Node<E> root;
    private int count = 0;

    public void insert(int data) {
        // ? 0 1 0 0 1 1
        // ? 0 1 2 3 4 5
        if (data != 0) {
            if (root == null)
                root = new Node(data, 0);
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

    public void insert(E data) {
            if (root == null)
                root = new Node(data);
            else {
                Node<E> current = root;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(data);
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

    public static double calculateCosSim(ZeroList<Integer> main_vector, ZeroList<Integer> target_vector) {
        // ? vektörlerin çarpımı / vektörlerin uzunluklarının çarpımı
        // main : [1,1,1,0,0,1]
        // 1,2,3,6
        // target: [0,1,1,1,1,1]
        // 2,3,4,5,6
        Node<Integer> cur_main = main_vector.root;
        Node<Integer> cur_target = target_vector.root;
        double mul_of_vector = 0;
        double v_m_dis = 0;
        double v_t_dis = 0;

        while (cur_main != null) {
            while (cur_main != null && cur_target != null && cur_main.index != cur_target.index) {

                if (cur_main.index < cur_target.index) {
                    v_m_dis += cur_main.data * cur_main.data;
                    cur_main = cur_main.next;
                } else {
                    v_t_dis += cur_target.data * cur_target.data;
                    cur_target = cur_target.next;
                }
            }

            mul_of_vector += cur_main.data * cur_target.data;
            v_m_dis += cur_main.data * cur_main.data;
            v_t_dis += cur_target.data * cur_target.data;
            cur_main = cur_main.next;
            cur_target = cur_target.next;
        }
        System.out.println(v_m_dis + " " + v_t_dis + " " + mul_of_vector);

        return mul_of_vector / (Math.sqrt(v_m_dis) * Math.sqrt(v_t_dis));
    }

    public static void main(String[] args) {
        ZeroList z1 = new ZeroList();
        ZeroList z2 = new ZeroList();
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
        z2.insert(1);
        z2.insert(1);

        z1.print();
        z2.print();

        System.out.println(calculateCosSim(z1, z2));
    }
}
