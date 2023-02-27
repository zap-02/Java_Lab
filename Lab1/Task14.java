package ch1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task14 {
    private static int isSquare(int size) {
        int a = (int) Math.sqrt(size);
        if(a * a == size) return a;
        else return -1;
    }
    private static boolean isMagicSquare(int[][] magicbox){
        //sum in diagonals
        int sumDiagMain = 0;
        int sumDiagSide = 0;
        for (int i = 0; i < magicbox.length; i++){
            sumDiagMain += magicbox[i][i];
            sumDiagSide += magicbox[i][magicbox.length - i - 1];
        }
        int uniqueSum = sumDiagMain;
        //System.out.println(uniqueSum);
        if (sumDiagSide != uniqueSum){
            return false;
        }

        //sums in rows
        for (int i = 0; i < magicbox.length; i++){
            int sum = 0;
            for (int j = 0; j < magicbox.length; j++){
                sum += magicbox[i][j];
            }
           // System.out.println(sum);
            if (sum != uniqueSum){
                return false;
            }
        }

        //sum in columns
        for (int i = 0; i < magicbox.length; i++){
            int sum = 0;
            for (int j = 0; j < magicbox.length; j++){
                sum += magicbox[j][i];
            }
            //System.out.println(sum);
            if (sum != uniqueSum){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            if (line.isEmpty()) {
                break;
            }
            String[] words = line.split("\\s+");
            for (String word : words) {
                list.add(Integer.parseInt(word));
            }
        }
        int size = isSquare(list.size());
        if(size > 0 ){
            int[][] magicbox = new int[size][size];
            int k = 0;
            for(int i = 0; i < size; i++){
                for(int j = 0; j < size; j++){
                    magicbox[i][j] = list.get(k);
                    k++;
                }
            }
            System.out.println(Arrays.deepToString(magicbox));
            if(isMagicSquare(magicbox)){
                System.out.println("Является магическим квадратом");
            }
            else System.out.println("Не является магическим квадратом");

        }
        else System.out.println("Введенные значения не квадрат");
    }
}