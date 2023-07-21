package day03typecastingwrapperscanner;


import java.util.Scanner;

public class Scanner01 {

    //Scanner kullancidan data almaya yarar Scanner kullanici 'le etkilesim kurmamizi saglar
    //Scanner b'r java clasidir bu classı kullanbılmek için ımport etmek gerekir
    //Scanner classı javanın util kutuphanesidir

       public static void main(String[] args) {

        //Kullanıcıdan data almak için yapılması gerekenler
        //1.Adım Scanner classından object olusturun
        Scanner input = new Scanner(System.in);

        //2.Adım:Kullanıcıya ne yapacagnı soyle
        System.out.println("Hey kullanııc yasını gir...");

        //3.Adım: Kullanıcıdan aldıgınzı datayı bir variable in icine koyun
        byte age= input.nextByte();

        System.out.println("Hey kullanıcı senin yasin" + age);


    }
}
