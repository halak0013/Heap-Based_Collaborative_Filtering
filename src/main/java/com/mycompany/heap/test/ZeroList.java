//Bisimillahirrahmanirrahim
package com.mycompany.heap.test;

public class ZeroList {
    Node root;
    private int count = 0;

    public void insert(int data) {
        // ? 0 1 0 0 1 1
        // ? 0 1 2 3 4 5
        if (data != 0) {
            if (root == null)
                root = new Node(data, 0);
            else {
                Node current = root;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = new Node(data, count);
            }
        }
        count++;
    }

    public static double calculateCosSim(ZeroList main_vector, ZeroList target_vector) {
        // ? vektörlerin çarpımı / vektörlerin uzunluklarının çarpımı
        // main : [1,1,1,0,0,1]
                //1,2,3,6
        // target: [0,1,1,1,1,1]
                //2,3,4,5,6
        Node cur_main = main_vector.root;
        Node cur_target = target_vector.root;
        double mul_of_vector = 0;
        double v_m_dis = 0;
        double v_t_dis = 0;
        while (cur_main != null) {
            while (cur_main != null && cur_target != null && cur_main.index != cur_target.index) {
                v_m_dis+=cur_main.data*cur_main.data;
                v_t_dis+=cur_target.data*cur_target.data;
                if(cur_main.index<cur_target.index)
                    cur_main=cur_main.next;
                else
                    cur_target=cur_target.next;
            }
            mul_of_vector+=cur_main.data*cur_target.data;
            v_m_dis+=cur_main.data*cur_main.data;
            v_t_dis+=cur_target.data*cur_target.data;
        }

        return mul_of_vector/(Math.sqrt(v_m_dis) *Math.sqrt(v_t_dis));
    }

}
