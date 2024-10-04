package List;

public class MyList <T> {

    private MyNode<T> head;
    private int size;

    public MyList(MyNode<T> head, int size) {
        this.head = head;
        this.size = size;
    }

    public MyList() {

    }

    public void add(T element) {
        MyNode<T> newNode = new MyNode<T>(element);
        if (head == null) {
            head = newNode;
        } else {
            MyNode<T> current = head;
            while (current.next != null) {
                current = current.next;

            }
            current.next = newNode;
        }
        size++;

    }

    public MyNode<T> getHead() {
        return head;
    }

    public void setHead(MyNode<T> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void remove(T element) {
        if (head == null) {
            return;
        }
            head = head.next;
size--;

    }

    @Override
    public String toString() {
        return "MyList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }


}
