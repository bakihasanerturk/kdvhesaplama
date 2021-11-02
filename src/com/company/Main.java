package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double urunFiyati,kdv1,kdv2,kdvliUrunFiyati,kdvTutari;
        kdv1 = 0.18;
        kdv2 = 0.08;
        System.out.print("lütfen Fiyat Giriniz : ");
        urunFiyati = scan.nextDouble();
        System.out.print("Ürün Fiyatı = " + urunFiyati);

        if(urunFiyati>0 && urunFiyati<=1000){
            kdvliUrunFiyati = (urunFiyati*kdv1)+urunFiyati;
            System.out.print("\nKDV'li Ürün Fiyatı = " + kdvliUrunFiyati);
        }else if (urunFiyati>1000){
            kdvliUrunFiyati = (urunFiyati*kdv2)+urunFiyati;
            System.out.print("\nKDV'li Ürün Fiyatı = " + kdvliUrunFiyati);
        }else{
            System.out.print("\nLütfen geçerli bir fiyat giriniz");
        }

    }
}
