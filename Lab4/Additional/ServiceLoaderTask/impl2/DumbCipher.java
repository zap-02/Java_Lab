package Additional.ServiceLoaderTask.impl2;

import Additional.ServiceLoaderTask.Cipher;

public class DumbCipher implements Cipher {
    @Override
    public byte[] encrypt(byte[] source, byte[] key) {
        byte[] to = source.clone();
        to[0] = (byte) (-1 * source[0]);
        return to;
    }

    @Override
    public byte[] decrypt(byte[] source, byte[] key) {
        byte[] to = source.clone();
        to[0] = (byte) (-1 * source[0]);
        return to;
    }

    @Override
    public int strength() {
        return 0;
    }
}
