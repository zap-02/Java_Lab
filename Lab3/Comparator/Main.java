package Comparator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Worker worker1 = new Worker(10,2);
        Worker worker2 = new Worker(20, 1);
        Worker worker3 = new Worker(15, 4);
        Worker worker4 = new Worker(15, 3);
        Worker worker5 = new Worker(25, 5);
        Worker worker6 = new Worker(42, 6);
        Worker[] workers = new Worker[]{worker1,worker2,worker3,worker4,worker5,worker6};

        Comparator<Worker> comp = new WorkerComparator();
        System.out.println(comp.compare(worker1, worker2));
        System.out.println(comp.reversed().compare(worker1, worker2));

        System.out.println(comp.thenComparing((x,y) -> x.getId() - y.getId()).compare(worker3, worker4));


    }
}
