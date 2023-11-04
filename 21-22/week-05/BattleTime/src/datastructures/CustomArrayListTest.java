package datastructures;

import entities.UnitMage;

import java.util.HashMap;

public class CustomArrayListTest {

    public static void test() {

        removeListElementTest();
        removeListFirstElementTest();
        removeListNonExistingElementTest();
    }

    private static void removeListElementTest() {

        System.out.println("Test 1");
        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.removeAt(2);

        for(int element : list) {
            System.out.println(element);
        }

//        for(Object element : list.getCollection()) {
//            System.out.println(element);
//        }
    }

    private static void removeListFirstElementTest() {

        System.out.println("Test 2");
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.removeAt(0);

        for(Object element : list.getCollection()) {
            System.out.println(element);
        }
    }

    private static void removeListNonExistingElementTest() {

        System.out.println("Test 3");
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.removeAt(19);

        for(Object element : list.getCollection()) {
            System.out.println(element);
        }
    }
}
