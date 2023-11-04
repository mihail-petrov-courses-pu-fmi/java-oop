package datastructures;

public class CustomArrayList<E> {

    private Object[] collection;
    private int currentIndex = 0;
    private final int INITIAL_LIST_SIZE = 4;

    public CustomArrayList() {
        this.collection = new Object[this.INITIAL_LIST_SIZE];
    }

    public void add(E element) {

        if(this.collection.length == (this.currentIndex)) {
            this.collection = this.expandArray(this.collection);
        }

        this.collection[this.currentIndex++] = element;
    }

    public E[] getCollection() {
        return (E[]) this.collection;
    }

    public E get(int index) {
        return (E) this.collection[index];
    }

    public int size() {
        return this.currentIndex + 1;
    }

    private Object[] expandArray(Object[] collection) {

        Object[] newCollection = new Object[collection.length * 2];
        for(int i = 0; i < collection.length; i++) {
            newCollection[i] = collection[i];
        }
        return newCollection;
    }
}
