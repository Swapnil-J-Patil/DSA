package StringAndStringBuilder;

import java.text.DecimalFormat;
import java.util.Arrays;

public class StringBuilderClass {
    public static void main(String[] args) {

        //splitting text
        String s="This is my text insert it into array";
        String[] str=s.split(" ");
        System.out.println(Arrays.toString(str));

        //Rounding off
        DecimalFormat df=new DecimalFormat("00.000000");
        System.out.println(df.format(2.56));

        
    }
}
