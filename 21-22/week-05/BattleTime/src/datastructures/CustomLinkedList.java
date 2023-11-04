package datastructures;

public class CustomLinkedList<T> implements CustomList<T> {

    private CustomLinkedListNode<T> head;
    private CustomLinkedListNode<T> tail;

    @Override
    public T get(int index) {

        if(index == 0) {
            return this.head.getValue();
        }

        int currentIndex    = 0;
        CustomLinkedListNode<T> currentNode = this.head;

        while(currentNode.hasNext()) {

            currentNode = currentNode.getNext();
            currentIndex++;

            if(currentIndex == index) {
                return currentNode.getValue();
            }
        }

        return null;
    }

    @Override
    public void removeAt(int index) {

    }

    @Override
    public void add(T element) {

        //  създаване нов ЕЛЕМЕНТ Node
        CustomLinkedListNode<T> nextNode = new CustomLinkedListNode<T>(element);

        if(this.tail != null) {
            this.tail.setNext(nextNode);
            this.tail = nextNode;
        }

        if(this.head == null) {
            this.head = nextNode;
            this.tail = this.head;
        }



//        else {
//            this.head.setNext(node);
//        }
    }
}
