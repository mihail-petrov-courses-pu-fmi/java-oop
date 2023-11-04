package university.fmi.oop;

import university.fmi.oop.lottery.Lottery;

public class Application {

    public static void main(String... args) {
        System.out.println("Hello, stranger");

        Lottery bulgarianLottery = new Lottery();
        bulgarianLottery.startLottery();
    }
}
