package Additional.ServiceLoaderTask;

import java.util.ServiceLoader;

public class Main {
    public static ServiceLoader<Cipher> cipherLoader =
            ServiceLoader.load(Cipher.class);

    public static Cipher getCipher(int minStrength) {
        for (Cipher cipher : cipherLoader) // неявно вызывает итератор
            if (cipher.strength() >= minStrength) return cipher;
        return null;
    }

    public static void main(String[] args) {
        Cipher cipher = getCipher(1);//выбор уровня силы кодера
        byte[] bytesForCod = {1,2,4,1,2,3,4};
        byte[] key = {3,4};
        byte[] coded = cipher.encrypt(bytesForCod, key);
        System.out.print("Coded: ");
        for(byte b: coded){
            System.out.print(b);
        }
        System.out.println();
        byte[] decoded = cipher.decrypt(coded, key);
        System.out.print("Decoded: ");
        for(byte b: decoded){
            System.out.print(b);
        }
        System.out.println();
    }
}