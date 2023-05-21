package com.mycompany.heap.test;

public class Distance implements Comparable<Distance> {

    ZeroList<Integer> vektor;
    double uzaklık;

    public Distance(ZeroList<Integer> vektor, double uzaklık) {
        this.vektor = vektor;
        this.uzaklık = uzaklık;
    }

    @Override
    public int compareTo(Distance other) {
        return Double.compare(this.uzaklık, other.uzaklık);
    }
}
