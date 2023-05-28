// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = calculator.addition(5, 3);
        System.out.println("Результат сложения: " + result);

        boolean isGreater = calculator.isGreater(7.5, 4.2);
        System.out.println("Первое число больше второго? " + isGreater);
    }
}