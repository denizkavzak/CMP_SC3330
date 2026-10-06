package edu.mu.generics.compare;

import java.util.ArrayList;

public class ContainerList<T extends Comparable<T>> {

    private ArrayList<T> container;
    private int minIndex;

    public ContainerList() {
        container = new ArrayList<>();
        minIndex = -1;
    }

    public void addItem(T item) {

        container.add(item);

        if (minIndex == -1) {
            minIndex = 0;
        }
        else {
            updateMin(item);
        }
    }

    private void updateMin(T item) {

        T currentMin = container.get(minIndex);

        if (item.compareTo(currentMin) < 0) {
            minIndex = container.size() - 1;
        }
    }

    public T getMin() {

        if (minIndex == -1) {
            return null;
        }

        return container.get(minIndex);
    }

    public ArrayList<T> getContainer() {
        return new ArrayList<>(container);
    }
}
