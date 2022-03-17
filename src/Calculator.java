import java.util.function.*;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;

//    Код ниже не сработает при y = 0. В этом случае возникнет Arithmetic Exception
//    Для решения можно, например, в теле лямбда-выражения выполнять проверку
//    переменной "y" на равенство нулю. И в случае у = 0 возвращать null.
//    Далее использовать null для реализации сообщения пользователю об ошибке.
//    Также нужно переписать функцию println, чтобы можно было выводить сообщение об ошибке деления на нуль.
//    BinaryOperator<Integer> divide = (x, y) -> x / y;

    BinaryOperator<Integer> divide = (x, y) -> y != 0 ? x / y : null;

    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x > 0 ? x : x * -1;

    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> println = System.out::println;
}
