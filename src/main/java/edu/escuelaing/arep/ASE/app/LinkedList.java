package edu.escuelaing.arep.ASE.app;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class LinkedList implements List {

    private int size;
    private Node head;
    private Node position;

    public LinkedList(){
        this.size = 0;
        this.head = null;
    }

    private static class Node<AnyType> {
        private AnyType data;
        private Node<AnyType> next;
        private Node<AnyType> prior;

        public Node(AnyType data, Node<AnyType> next, Node<AnyType> prior) {
            this.data = data;
            this.next = next;
            this.prior = prior;
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0){
            return true;
        }else{
            return false;
        }
    }

    public boolean contains(Object o) {
        return false;
    }

    public Iterator iterator() {
        return null;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public boolean add(Object o) {
        return false;
    }

    public boolean remove(Object o) {
        return false;
    }

    public boolean addAll(Collection c) {
        return false;
    }

    public boolean addAll(int index, Collection c) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    public ListIterator listIterator() {
        return null;
    }

    public ListIterator listIterator(int index) {
        return null;
    }

    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public boolean retainAll(Collection c) {
        return false;
    }

    public boolean removeAll(Collection c) {
        return false;
    }

    public boolean containsAll(Collection c) {
        return false;+
    }

    public Object[] toArray(Object[] a) {
        return new Object[0];
    }
}