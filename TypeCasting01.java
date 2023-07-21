package day03typecastingwrapperscanner;

public class TypeCasting01 {

    //Type casting bir numeric data tipini diger numeric data tipine cevirmek
    // byte<short<int<long<float<double

    //Not: Kucuk data typeini buyuk data typeıne cevırmeye Auto Widening denir.
    //Not2: Buyuk data typeini kucuk data typeini cevirmeye Explicit Norrowing denir

    public static void main(String[] args) {

         byte age = 23;

         int NewAge = age;

         long population =1234;

         int newPopulation = (int) population;

         //Example 1: shortu doublea ceviren kodu yazınız
        // 2 floati byte yapan kodu yazınız

        short number = 26;

        double NewNumber = number;

        float price = 1F;

        byte newPrice = (byte)price;

        System.out.println(newPrice);//==> java ondalık sayıyı tam sayıya cevirirken yuvarlama islmei yapmaz.
        // java ondalık sayıyı tam sayıya cevırırken ondalık ksımını sıler

        int rakam = 515;

        byte newRakam = (byte)rakam;

        System.out.println(newRakam);

        int num = 510;

        byte newNum = (byte) num;

        System.out.println(newNum);




    }

}
