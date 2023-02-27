import java.util.ArrayList;
import java.util.Random;
import java.util.Collections;

public class Lab1_Ex13 {

    public static void main(String[] args) {
        Random rand = new Random();
        int number;

        ArrayList<Integer> Num = new ArrayList<>(49);

        for(int i = 0; i<49; i++)
            Num.add(i, i+1);

        for(int i = 0; i<6;){
            number = rand.nextInt();
            number = Math.floorMod(number, 49) + 1;
            for(int j = 0; j< Num.size(); j++){
                if(number == Num.get(j) ){
                    Num.remove(j);
                    i++;
                }
            }
        }

        Collections.sort(Num);

        System.out.println("Sorted array: ");
        for(int i = 0; i< Num.size(); i++)
            System.out.print(Num.get(i)+" ");


//        for(int i = 0; i < Num.size(); i++)
//            System.out.print(" " + Num.get(i));



    }

}
