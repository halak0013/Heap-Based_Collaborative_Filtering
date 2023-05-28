package com.mycompany.heap.based_collaborative_filtering;

public class CosSimilarity {
    private double length(ZeroList<Integer> vector) {
        Node<Integer> cur = vector.root;
        double length = 0;
        while (cur != null) {
            length += cur.data * cur.data;
            cur = cur.next;
        }
        return length;
    }

    private double dotProduct(ZeroList<Integer> main_vector, ZeroList<Integer> target_vector) {
        Node<Integer> cur_m = main_vector.root;
        Node<Integer> cur_t = target_vector.root;
        double dotProduct = 0;
        while (cur_m != null && cur_t != null) {
            if (cur_m.index < cur_t.index) {
                cur_m = cur_m.next;
            } else if (cur_m.index > cur_t.index) {
                cur_t = cur_t.next;
            } else {
                dotProduct += cur_m.data * cur_t.data;
                cur_m = cur_m.next;
                cur_t = cur_t.next;
            }
        }

        return dotProduct;
    }

    public double calculateCosSim(ZeroList<Integer> main_vector, ZeroList<Integer> target_vector) {
        double mul_of_vector = dotProduct(main_vector, target_vector);
        double v_m_dis = length(main_vector);
        double v_t_dis = length(target_vector);

        //System.out.println(v_m_dis + " " + v_t_dis + " " + mul_of_vector);
        return mul_of_vector / (Math.sqrt(v_m_dis) * Math.sqrt(v_t_dis));
    }
}
