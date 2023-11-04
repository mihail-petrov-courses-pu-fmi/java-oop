package datastructures;

public class CustomLinkedListTest {

    public static void test() {
        addNewElementTest();
    }

    private static void addNewElementTest() {

        System.out.println("Test 1");
        CustomList list = new CustomLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list.get(1));

        // **
        // Loop

//        for(Object element : list.getCollection()) {
//            System.out.println(element);
//        }
    }
}
