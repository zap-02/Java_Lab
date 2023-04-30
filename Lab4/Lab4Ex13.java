import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

/*
Напишите метод, выводящий таблицу значений из любого объекта типа Method, описывающего метод с
параметром типа double или Double. Помимо объекта типа Method, этот метод должен принимать нижний и верхний предел,
а также величину шага. Продемонстрируйте свой метод, выведя таблицы для
методов Math.sqrt() и Double. toHexString(). Напишите еще один вариант
данного метода, но на этот раз воспользуйтесь объектом типа DoubleFunction
<0bject> вместо объекта типа Method
 */
public class Lab4Ex13 {
    static void printValues(Method method, double lowerLimit, double higherLimit, double step){
        System.out.println("Table for method " + method.getName());
        for(double i = lowerLimit; i < higherLimit; i += step){
            try {
                System.out.println(method.invoke(null, i));
            } catch (IllegalAccessException | InvocationTargetException e) {
                throw new RuntimeException(e);
            }
        }
    }
    static void printValuesDoubleFunction(DoubleFunction<Object> function, double lowerLimit, double higherLimit, double step){
        System.out.println("Table for function:");
        for(double i = lowerLimit; i < higherLimit; i += step){
            System.out.println(function.apply(i));
        }
    }
    public static void main(String[] args) {
        Method sqrtMethod, toHexStringMethod;
        try {
            sqrtMethod = Math.class.getMethod("sqrt", double.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        try {
            toHexStringMethod = Double.class.getMethod("toHexString", double.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        printValues(sqrtMethod, 1.01, 2, 0.2);
        printValues(toHexStringMethod, 10, 20, 1);
        printValuesDoubleFunction(Math::sqrt, 0.01, 1, 0.1);
        printValuesDoubleFunction(Double::toHexString, 0, 10, 1);
    }
}
