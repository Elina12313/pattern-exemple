package List;


public class StackStrategy<T> implements ListStrategy<T> {

    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode) {
        newMyNode.setNext(head);
        return newMyNode;
    }

    @Override
    public MyNode<T> remove(MyNode<T> head) {
        if (head == null) {
            return null;
        }
        return head.getNext();
    }


    @Override
    public void remove(MyNode<T> head, MyNode<T> current) {

    }
}
