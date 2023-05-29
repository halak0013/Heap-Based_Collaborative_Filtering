package com.mycompany.heap.based_collaborative_filtering;

public class Distance implements Comparable<Distance> {

    ZeroList<Integer> vektor;
    double distance;
    int index;

    public Distance(ZeroList<Integer> vektor, double distance) {
        this.vektor = vektor;
        this.distance = distance;
    }

    public Distance(int index, double distance) {
        this.index = index;
        this.distance = distance;
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
