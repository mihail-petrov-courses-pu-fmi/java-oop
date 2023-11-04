package datastructures;

public interface CustomList<T> {

    T get(int index);

    boolean removeAt(int index);

    void add(T element);

    int size();

    default boolean isInBoundary(int index) {
        return index - 1 < this.size();
    }
}
