package datastructures;

public interface CustomList<T> {

    T get(int index);

    void removeAt(int index);

    void add(T element);
}
