package edu.mu.generics.compare.statistics;

import java.util.ArrayList;

public class Statistics<T extends Comparable<T>> {

    private ArrayList<T> data;

    public Statistics() {
        data = new ArrayList<>();
    }

    public void add(T value) {
        data.add(value);
    }

    public T min() {

        if (data.isEmpty()) {
            return null;
        }

        T min = data.get(0);

        for (T value : data) {
            if (value.compareTo(min) < 0) {
                min = value;
            }
        }

        return min;
    }
}
