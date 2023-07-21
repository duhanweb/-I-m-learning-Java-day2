package day03typecastingwrapperscanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {


        //Example1: sayilari kullanicidan alan ve   toplama ';lem' yapan kodu yaziniz

        //1/Adim?Scanner classindan object olustur

        Scanner input = new Scanner(System.in);

        //2.Adım:Kullanıcıya ne yapacagnı soyle
        System.out.println("Ilk sayıyı girin");

        double sayi1 = input.nextDouble();

        System.out.println("ıkıncı sayıyı giriniz...");
        double sayi2 = input.nextDouble();

        System.out.println(sayi1 + sayi2);
    }

}
