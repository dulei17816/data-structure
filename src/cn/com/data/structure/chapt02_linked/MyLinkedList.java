package cn.com.data.structure.chapt02_linked;

public class MyLinkedList<E> {

    private Node<E> first;

    private Node<E> last;

    private int size;

    public MyLinkedList() {
    }

    public boolean add(E o) {
        linkLast(o);
        return true;
    }

    public void add(int index, E element) {
        checkPositionIndex(index);
        linkLast(element);
    }

    public E get(int index) {
        checkElementIndex(index);
        return node(index).data;
    }

    private Node<E> node(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    private void checkElementIndex(int index) {
        if (!isElementIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }


    private boolean isElementIndex(int index) {
        return index >= 0 && index < size;
    }

    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index))
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    private boolean isPositionIndex(int index) {
        return index >= 0 && index <= size;
    }

    public E set(int index, E o) {
        isElementIndex(index);
        Node<E> node = node(index);
        E oldVal = node.data;
        node.data = o;
        return oldVal;
    }

    void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node(e);
        last = newNode;
        if (null == first) {
            first = newNode;
        }else {
            l.next = newNode;
        }
        size++;
    }



    class Node<E>{

         E data;
         Node<E> next;

        public Node(E data) {
            this.data = data;
        }

    }
}
