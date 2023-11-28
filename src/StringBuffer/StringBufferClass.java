package StringBuffer;

import java.util.Random;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer str=new StringBuffer("Swapnil");
        str.append(" is cool");

        str.replace(0,10,"I am");
        //default size is 16

        System.out.println(str);
        System.out.println(randomString(3));
    }
    public static String randomString(int size)
    {
        Random random=new Random();
        StringBuffer str=new StringBuffer(size);

        for (int i = 0; i < size; i++) {
            int randomChar= 97+(int)(random.nextFloat() *26);
            str.append((char) randomChar);
        }
        return str.toString();
    }
}
