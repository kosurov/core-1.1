public class Main {

    public static void main(String[] args) {
	Calculator calc = Calculator.instance.get();
//    Calculator calc = new Calculator();

    int a = calc.plus.apply(1, 2);
    int b = calc.minus.apply(1, 1);
    Integer c = calc.divide.apply(a, b);

    calc.println.accept(c);

    }
}
