package MyFirstLinkedList;

import java.util.Iterator;

public class MyLinkedList <E> implements Linked<E>, Iterable<E>, DescendingIterator<E> {
    private Node<E> firstNode;
    private Node<E> lastNode;
    private int size = 0;

    public MyLinkedList() {
        lastNode = new Node<E>(null, firstNode, null);
        firstNode = new Node<E>(null, null, lastNode);
    }


    @Override
    public void addLast(E e) {
        Node<E> prev = lastNode;
        prev.setCurrentElement(e);
        lastNode = new Node<E>(null, prev, null);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public void addFirst(E e) {
        Node<E> next = firstNode;
        next.setCurrentElement(e);
        firstNode = new Node<>(null, null, next);
        next.setPrevElement(firstNode);
        size++;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E getElementByIndex(int counter) {
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < counter; i++) {
            target = getNextElement(target);
        }
        return  target.getCurrentElement();
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
           int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < size;
            }

            @Override
            public E next() {
                return getElementByIndex(counter++);
            }
        };
    }

    @Override
    public Iterator<E> descendingIterator() {
        return new Iterator<E>() {
            int counter = size - 1;
            @Override
            public boolean hasNext() {
                return counter >= 0;
            }

            @Override
            public E next() {
                return getElementByIndex(counter--);
            }
        };
    }

    private Node<E> getNextElement(Node<E> current){
        return current.getNextElement();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> target = firstNode.getNextElement();
        for (int i = 0; i < size; i++) {
            sb.append(target.getCurrentElement());
            if (i != size - 1) sb.append("<->");
            target = getNextElement(target);
        }
        return sb.toString();
    }

}