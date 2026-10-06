package edu.mu.generics.container.list;

import java.util.ArrayList;

public class ContainerList<T> {

    private ArrayList<Container<T>> containers;

    public ContainerList() {
        containers = new ArrayList<>();
    }

    public void addContainer(Container<T> container) {
        containers.add(container);
    }
}
