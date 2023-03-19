
//Нельзя использовать IntHolder тк данный класс устарел и не поддерживается данной версией JDK

public class Lab2Ex4 {

    public static void main(String[] args) {
        Integer a = 10;
        Integer b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);

        swapIntegers(a, b);

        System.out.println("After swap: a = " + a + ", b = " + b);
    }
    //показываем,что, например, Integer не работает тк Integer immutable и в методе создаются копии
    public static void swapIntegers(Integer a, Integer b) {
        int temp = a.intValue();
        a = Integer.valueOf(b.intValue());
        b = Integer.valueOf(temp);
    }


}
