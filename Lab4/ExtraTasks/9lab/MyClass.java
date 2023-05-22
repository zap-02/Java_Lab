import java.lang.reflect.Array;

public class MyClass {
//    public class A {
//        private B b;
//
//        public void setB(B b) {
//            this.b = b;
//        }
//    }
//
//    public class B {
//        private A a;
//
//        public void setA(A a) {
//            this.a = a;
//        }
//    }

//    A objA = new A();
//    B objB = new B();


    private Node node1;

    private Node node2;


    private int number = 2;
    private char name = 'A';


    private UnderMyClass litlle = new UnderMyClass();


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(char name) {
        this.name = name;
    }

    private void printData() {
        System.out.println(number + name);
    }
}