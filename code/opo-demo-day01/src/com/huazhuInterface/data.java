package com.huazhuInterface;

public interface data<E> {
    void add(E e);
    void delete(int id);
    void update(E e);
    E queryById(int id);
}
