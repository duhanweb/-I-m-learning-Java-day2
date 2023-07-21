package day03typecastingwrapperscanner;

import java.sql.SQLOutput;

public class WrapperClass01 {

    public static void main(String[] args) {


        /*
        Note: Java primitive lere methodlar ekleyerek yeni bir
        yapi olusturdu bu yapiya "Wrapper Class"

        Primitive    Wrapper

        byte ==> Byte
        short == Short
        ** int ==> İnteger
        long ==> Long
        float ==> FLoat
        double ==> Double
        boolean ==> Boolean
        ** char ==> Character
         */

        byte primitiveByte = 12;//primitiveByte yazip nokta koydugunuzda hic method goremesiniz cunku primitivler method icermez saddece deger icerir.

        Byte wrapperByte = 12;//wrapperByte yazip nokta koydgunuzda bir cok method gorursunuz cunku wrapper lar method icerir

        //byte data typenin en kucuk ve en buyuk degerlleri ekrana yazdrınız.

        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127

        //Ex2; short int long data  typelarının en buyuk ve en kuck degerlerini ekrana yazdırınız

        System.out.println(Short.MIN_VALUE);//-32768
        System.out.println(Short.MAX_VALUE);//32767

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(Long.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);


        //primitiveler nasıl wrapper lara cevrılır
        float f1= 13.99F;

        Float wrapperF1 = f1;

        // wrapper  nasıl primitive cevrılır
        Character w1= 's';

        char primitiveW1 = w1;

        //Note:Autobox'ng ve Unbox'ng java tarafindan otomatik olarak yapilir
    }


}
