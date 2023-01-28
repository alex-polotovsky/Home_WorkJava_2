package LoggeredCalculator;

public class Controller {
    static void control() {
        Calc.x = View.inView();
        Calc.y = View.inView();
        String operator = View.operatorView();
        double res = switch (operator) {
            case "+" -> Calc.sum();
            case "-" -> Calc.sub();
            case "*" -> Calc.mult();
            case "/" -> Calc.div();
            default -> 0.0;
        };
        View.outView(res);
    }
}
