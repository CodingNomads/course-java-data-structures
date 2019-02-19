package com.codingnomads.list;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Write a MyLinkedList from scratch. Make it generic.
 * <p>
 * https://crunchify.com/how-to-implement-a-linkedlist-class-from-scratch-in-java/
 * Double challenge, make it a doubly linked list.
 */

class MyLinkedList<E> implements Iterable<E> {

    private Node<E> head;

    public void insert(E data) {

        Node<E> node = new Node<>();
        node.setData(data);

        if (head == null) {
            head = node;
        } else {
            Node<E> n = head;
            while (n.getNext() != null) {
                n = n.getNext();
            }
            n.setNext(node);
        }

    }

    public void show() {
        Node<E> n = head;
        while (n != null) {
            System.out.println(n.getData());
            n = n.getNext();
        }
    }

    public void insertAtStart(E data) {
        Node<E> node = new Node<>();
        node.setData(data);
        node.setNext(head);
        head = node;
    }

    public void insertAt(int index, E data) {

        if (index == 0) {
            insertAtStart(data);
        } else {
            try {
                Node<E> node = new Node<>();
                node.setData(data);
                Node n = head;
                for (int i = 0; i < index - 1; i++) {
                    n = n.getNext();
                }
                node.setNext(n.getNext());
                n.setNext(node);
            } catch (NullPointerException exc) {
                System.out.println("[ERROR] Index does not exist - insertAt action not implemented. Exception: " + exc);
            }

        }

    }

    public void delete(int index) {
        try {
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.getNext();
            }
            n.setNext(n.getNext().getNext());
        } catch (NullPointerException exc) {
            System.out.println("[ERROR] Index does not exist - delete action not implemented. Exception: " + exc);
        }
    }

    public int size() {

        int counter = 1;
        Node n = head;
        while (n.getNext() != null) {
            counter++;
            n = n.getNext();
        }
        return counter;
    }

    public E get(int index) {
        if (head == null) {
            throw new NullPointerException();
        } else {
            Node<E> n = head;
            for (int i = 0; i < index; i++) {
                n = n.getNext();
            }
            return n.getData();
        }
        // try-catch left out on purpose to not 'Pokemon' every NullPointerException - valid here since it should crash


    }

    // Iterator Implementation


    @Override
    public Iterator<E> iterator() {
        return new MyLinkedListIterator();
    }

    private class MyLinkedListIterator implements Iterator<E> {

        Node<E> current = null;

        @Override
        public boolean hasNext() {
            if (current == null && head != null) {
                return true;
            } else if (current != null) {
                return current.getNext() != null;
            }
            return false;
        }

        @Override
        public E next() {
            if (current == null && head != null) {
                current = head;
                return head.getData();
            } else if (current != null) {
                current = current.getNext();
                return  current.getData();
            }
            throw new NoSuchElementException();
        }
    }
}
