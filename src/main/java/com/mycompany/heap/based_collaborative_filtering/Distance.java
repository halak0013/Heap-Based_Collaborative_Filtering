package com.mycompany.heap.based_collaborative_filtering;

public class Distance implements Comparable<Distance> {

    ZeroList<Integer> vektor;
    double distance;
    int index;

    public Distance(ZeroList<Integer> vektor, double uzaklık) {
        this.vektor = vektor;
        this.distance = uzaklık;
    }

    public Distance(int index, double uzaklık) {
        this.index = index;
        this.distance = uzaklık;
    }

    @Override
    public int compareTo(Distance other) {
        return Double.compare(this.distance, other.distance);
    }

    @Override
    public String toString() {
        return this.distance+"";
    }
}
