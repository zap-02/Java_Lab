import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.PrintStream;

public class Lab4Ex11 {
    public static void main(String[] args) throws Exception {
        // получаем класс System
        Class<?> systemClass = Class.forName("java.lang.System");
        // получаем поле out
        Field outField = systemClass.getField("out");
        // получаем объект типа PrintStream, связанный с полем out
        PrintStream out = (PrintStream) outField.get(null);
        // получаем метод println класса PrintStream
        Method printlnMethod = PrintStream.class.getMethod("println", String.class);
        // вызываем метод println для объекта out
        printlnMethod.invoke(out, "Hello, World");
    }
}
