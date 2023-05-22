import java.lang.reflect.Field;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();

//        myClass.objA.setB(myClass.objB);
//        myClass.objB.setA(myClass.objA);

        Node node1 = new Node("Node 1");
        Node node2 = new Node("Node 2");

        node1.setNext(node2);
        node2.setNext(node1);


        System.out.println(Universal.toString(myClass));

    }
}