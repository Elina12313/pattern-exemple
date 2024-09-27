package org.exemple;

public interface ListStrategy <T>{
    MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode);
    void remove(MyNode<T> head, MyNode<T> current);
}
