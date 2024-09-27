package org.exemple;

public class MyNode <T>{
    private T value;
    public MyNode<T> next;

    public MyNode(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public MyNode<T> getNext() {
        return next;
    }

    public void setNext(MyNode<T> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "MyNode" +
                "value=" + value +
                ", next=" + next
                ;
    }
}
