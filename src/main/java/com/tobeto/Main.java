package com.tobeto;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       // notOrtalamasi();
        kdvTutari();
    }

    private static void notOrtalamasi() {
        int mat, fizik, kimya, turkce;

        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik notunuz : ");
        mat = inp.nextInt();
        System.out.print("Fizik notunuz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya notunuz : ");
        kimya = inp.nextInt();
        System.out.print("Türkçe notunuz : ");
        turkce = inp.nextInt();

        int toplam = (mat + fizik + kimya + turkce);
        double sonuc = (double) toplam / 4;
        System.out.println("Ortalamanız : " + sonuc);

        // // Ternary Operator kullanarak koşullu ifade
        String durum = (sonuc > 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.println("Sonuç: " + durum);


    }

    private static void kdvTutari (){
        Scanner tutar = new Scanner(System.in);
        System.out.print("Tutar giriniz : ");
        double para = tutar.nextDouble();

        double kdv = (para >= 0 && para <= 1000) ? 0.18 : 0.08;

        double kdvliTutar = para + para*kdv;

        System.out.println("Tutar : " + para);
        System.out.println("KDV tutarı : " + para*kdv);
        System.out.println("KDVli fiyat : " + kdvliTutar);
        System.out.println("KDV oranı : " + kdv);


    }
}