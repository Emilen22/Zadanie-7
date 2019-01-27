import java.util.Arrays;
import java.util.Scanner;

public class Board2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int firstNumber = input.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int secondNumber = input.nextInt();
        System.out.println("Podaj trzecią liczbę: ");
        int thirdNumber = input.nextInt();

        int[] numbers = new int[5];
        numbers[0] = firstNumber;
        numbers[1] = 0;
        numbers[2] = secondNumber;
        numbers[3] = 0;
        numbers[4] = thirdNumber;

        System.out.println("Twój wynik:");
        System.out.println(numbers[0]+numbers[2]+numbers[4]);
    }
}
