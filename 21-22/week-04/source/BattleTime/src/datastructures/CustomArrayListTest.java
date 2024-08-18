package datastructures;

import entities.UnitMage;

public class CustomArrayListTest {

    public static void test() {

        initCustomArrayList();
        testCustomArrayListExpandability();
        insertBooleans();
        insertUnitMage();
    }

    private static void initCustomArrayList() {

        System.out.println("Test 1");
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(Object element : list.getCollection()) {
            System.out.println(element);
        }
    }

    private static void testCustomArrayListExpandability() {

        System.out.println("Test 2");

        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        for(Object element : list.getCollection()) {
            System.out.println(element);
        }
    }


    private static void insertBooleans() {

        System.out.println("Test 3");

        CustomArrayList list = new CustomArrayList();
        list.add(true);
        list.add(false);

        for(Object element : list.getCollection()) {
            System.out.println(element);
        }
    }

    private static void insertUnitMage() {

        System.out.println("Test 4");

        CustomArrayList<UnitMage> list = new CustomArrayList<>();
        list.add(new UnitMage(0,0));
        list.add(new UnitMage(1,1));
        System.out.println(list.get(0).getRow());
        UnitMage[] newCollection = list.getCollection();

        for(int i = 0; i < list.size(); i++ ) {
            System.out.println(list.get(i).getCol());
            System.out.println(list.get(i).getRow());
        }

        // var collection = list.getCollection();
        // System.out.println(collection[0].getCol());

//        for(UnitMage element : list.getCollection()) {
//
//            if(element != null) {
//
//                // UnitMage unitMageElement = (UnitMage) element;
//                System.out.println(element.getRow());
//                System.out.println(element.getCol());
//                System.out.println("@@@");
//            }
//        }
    }
}
