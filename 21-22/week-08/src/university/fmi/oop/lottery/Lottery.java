package university.fmi.oop.lottery;

import university.fmi.oop.constant.Constant;
import university.fmi.oop.exception.InvalidChoiceException;
import university.fmi.oop.exception.NumberOutOfRangeException;
import university.fmi.oop.utility.RandomGenerator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * A class that holds a functionality for lottery simulation
 */
public class Lottery {

    public void startLottery() {
        System.out.println("Please enter a number greater or equal to 1 and lower or equal to 10");
        Scanner sc = new Scanner(System.in);

        try {
            int input = sc.nextInt();
            System.out.println("The entered number is: " + input);

            if (hasWinner(input)) {
                System.out.println("You are the winner of the lottery!");
            } else {
                System.out.println("Sorry, you lose! Please, try again!");
            }

            confirmMenu(sc);
        } catch (InputMismatchException ex) {
            System.err.println("Please enter a valid number!");
            startLottery();
        } catch (NumberOutOfRangeException ex) {
            System.err.println("Please enter a number within the required interval!");
            startLottery();
        } catch (InvalidChoiceException ex) {
            System.err.println("You entered invalid value! Allowed values: YES/NO");
            System.exit(Constant.EXIT_STATUS_1);
        } finally {
            sc.close();
        }
    }

    private void confirmMenu(Scanner sc) throws InvalidChoiceException {
        System.out.println("Do you want to try again? YES/NO");

        sc.nextLine(); // clear the buffer of the Scanner

        String answer = sc.nextLine();

        if (answer != null && answer.equalsIgnoreCase(Constant.POSITIVE_ANSWER)) {
            startLottery();
        } else if (answer != null && answer.equalsIgnoreCase(Constant.NEGATIVE_ANSWER)) {
            System.exit(Constant.EXIT_STATUS_0);
        } else {
            throw new InvalidChoiceException("Invalid confirmation input value: " + answer);
        }
    }


    private boolean hasWinner(int number) throws NumberOutOfRangeException {
        if (isValidDigit(number)) {
            int randomLotteryNumber = RandomGenerator.generate();
            System.out.println("The randomly generated number is: " + randomLotteryNumber);

            return randomLotteryNumber == number;
        } else {
            throw new NumberOutOfRangeException("The number is outside of the range: " + number);
        }
    }

    private boolean isValidDigit(int digit) {
        return (digit >= Constant.DEFAULT_MIN_VALUE && digit <= Constant.DEFAULT_MAX_VALUE);
    }
}
