package LoggeredCalculator;

import java.util.Scanner;

public class View {
    static Scanner console = new Scanner(System.in);

    static void outView(double result) {
        System.out.printf("Результат %.2f\n", result);
    }

    static int inView() {
        System.out.print("Введите целое число: ");
        int num;
        if (console.hasNextInt()) {
            num = console.nextInt();
        } else {
            System.out.println("Неверное число. Попробуйте ещё раз.");
            console.next();
            num = inView();
        }
        return num;
    }

    static String operatorView() {
        System.out.println("Введите символ арифметического действия: ");
        String operator;
        String s = console.next();

        if (s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) {
            operator = s;
        } else {
            System.out.println("Оператор не распознан. Попробуйте ещё раз!");
            operator = operatorView();
        }
        return operator;
    }
}
