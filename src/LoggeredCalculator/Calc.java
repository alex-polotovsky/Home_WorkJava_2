package LoggeredCalculator;

public class Calc {
    static double x;
    static double y;

    static int sum() {
        MainClick.logger.info("Операция сложения.");
        //System.out.println(pathFile);
        return (int)(x + y);

    }

    static int sub() {
        MainClick.logger.info("Операция вычитания.");
        return (int)(x - y);
    }

    static int mult() {
        MainClick.logger.info("Операция кмножения.");
        return (int)(x * y);
    }

    static double div() {
        MainClick.logger.info("Операция деления.");
        return x / y;
    }
}
