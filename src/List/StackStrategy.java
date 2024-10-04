package List;

public class StackStrategy <T> implements ListStrategy<T>{
    @Override
    public MyNode<T> add(MyNode<T> head, MyNode<T> newMyNode) {
        MyNode<T> current  = head;
        if (head == null) {
            head = newMyNode;
        }
        else {
            newMyNode.setNext(head);
            head = newMyNode;
        }
        return head;
    }

    @Override
    public void remove(MyNode<T> head, MyNode<T> current) {

    }
}
