package List;

public class QueueStrategy<T> implements ListStrategy<T> {
    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode) {
        MyNode<T> current = head;
        if (head == null) {
            head = newMyNode;
        } else {
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newMyNode);
        }
        return head;
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
