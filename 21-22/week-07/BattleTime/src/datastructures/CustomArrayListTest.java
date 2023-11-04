package datastructures;

import entities.UnitMage;

import javax.swing.plaf.nimbus.State;
import java.util.HashMap;
import java.util.function.Consumer;

public class CustomArrayListTest {

    public static void test() {

        testFunctionalInterface();

//        removeListElementTest();
//        removeListFirstElementTest();
//        removeListNonExistingElementTest();
    }

    public static void testFunctionalInterface() {

        CustomArrayList<Integer> list = new CustomArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

// 1. Инстанция на интерфейсен клас
        // list.forEach(new ConsumersumerImplementation());

// 2. Инстанция на анонимен клас
        Consumer<Integer> consumerInstance = new Consumer() {
            @Override
            public void accept(Object o) {
                System.out.println("This is anonimyus class");
                System.out.println(o);
            }
        };

        // list.forEach(consumerInstance);

// 3. Вътрешен анонимен клас
//        list.forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                System.out.println("Inner anonimys class");
//            }
//        });

// 4. С помоща на ламбда функции

        list.forEach(element -> {
            System.out.println("Lambda function");
            System.out.println(element);
        });

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

    }
}
