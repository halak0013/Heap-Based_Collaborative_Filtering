package com.mycompany.heap.based_collaborative_filtering;

public class Distance implements Comparable<Distance> {

    ZeroList<Integer> vektor;
    double distance;
    int d_index;
    int user_id;

    public Distance(ZeroList<Integer> vektor, double distance) {
        this.vektor = vektor;
        this.distance = distance;
    }

    public Distance(int d_index, double distance) {
        this.d_index = d_index;
        this.distance = distance;
    }

    public Distance(int d_index, double distance,int user_id) {
        this.d_index = d_index;
        this.distance = distance;
        this.user_id = user_id;
    }

    @Override
    public int compareTo(Distance other) {
        return Double.compare(this.distance, other.distance);
    }

    @Override
    public String toString() {
        return this.distance+" d_index: "+this.d_index+" vector 1.: "+ this.vektor.root.data+"---";
    }
}
