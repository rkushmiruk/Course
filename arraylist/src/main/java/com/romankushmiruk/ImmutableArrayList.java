package com.romankushmiruk;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ImmutableArrayList<T> extends AbstractList<T> {

    private List<T> array;

    public ImmutableArrayList() {
        array = new ArrayList<T>();
    }

    @Override
    public T get(int index) {
        return array.get(index);
    }

    @Override
    public int size() {
        return array.size();
    }

    public boolean add(T element) {
        return array.add(element);
    }

    public void add(int index, T element) {
        throw new UnsupportedOperationException();
    }

    public T set(int index, T element) {
        throw new UnsupportedOperationException();
    }

    public boolean isEmpty() {
        return array.isEmpty();
    }

    public boolean contains(Object o) {
        return array.contains(o);
    }

    public boolean containsAll(Collection<?> c) {
        return array.containsAll(c);
    }

    public boolean remove(Object element) {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

}
