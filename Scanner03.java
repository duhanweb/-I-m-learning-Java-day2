package day03typecastingwrapperscanner;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Scanner03 {

     public static void main(String[] args) {

        //Dikdortgen en ve boyunu alıp alan ve cevere hesaplama

        Scanner input = new Scanner (System.in);

        System.out.println("Dikdortgenin kısa kenarın giriniz");


        int en = input.nextInt();


        System.out.println("Dikdortgenin uzun kenarını giriniz");
        int boy = input.nextInt();


        System.out.println("Alan" + en*boy);

        System.out.println("Cevre" + 2*(en+boy));

    }
}
