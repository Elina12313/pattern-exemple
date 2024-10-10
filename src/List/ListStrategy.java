package List;

public interface ListStrategy<T> {
    MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode);

    MyNode<T> remove(MyNode<T> head);

    void remove(MyNode<T> head, MyNode<T> current);
}
