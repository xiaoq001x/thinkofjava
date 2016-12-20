package main.javaIO.nio;

/**
 * Created by Bashark on 2016/12/15.
 */
public class test {
    public static String bytes2HexString(byte[] b) {
        String ret = "";
        for (int i = 0; i < b.length; i++) {
            String hex = Integer.toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            ret += hex.toUpperCase();
        }
        return ret;
    }

    public static void main(String[] args) {
        String s = "sdsadasdas";
        transByte(s);
    }

    public static byte transByte(String s) {
        StringBuffer stringBuffer = new StringBuffer(s);
        System.out.println(stringBuffer.charAt(3));
        System.out.println(stringBuffer.length());

        return 0;
    }
}
