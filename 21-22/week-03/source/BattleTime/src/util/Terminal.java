package util;

import java.util.Scanner;

public class Terminal {

    public static int inputNumber() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int inputNumber(String message) {

        System.out.println(message);
        return inputNumber();
    }

    public static  String inputString() {

        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static  String inputString(String message) {

        System.out.println(message);
        return inputString();
    }

}
