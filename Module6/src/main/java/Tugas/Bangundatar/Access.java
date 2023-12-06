/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.Bangundatar;

/**
 *
 * @author yakub
 */
public class Access {
    public static void main(String[] args) {
        Persegi persegi = new Persegi();
        PersegiPanjang pPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        segiTigaSamaKaki kaki = new segiTigaSamaKaki();
        segitigaSamaSisi sisi = new segitigaSamaSisi();
        
        //Persegi
        persegi.sisi = 10;
        persegi.hitungLuas(persegi.sisi, persegi.sisi);
        persegi.hitungKeliling(persegi.sisi, persegi.sisi);
        
        //Persegi Panjang
        pPanjang.panjang = 15;
        pPanjang.lebar = 8;
        pPanjang.hitungLuas(pPanjang.panjang, pPanjang.lebar);
        pPanjang.hitungKeliling(pPanjang.panjang, pPanjang.lebar);
        
        //Segitiga
        segitiga.alas = 5; 
        
        //Segitiga Sama kaki
        kaki.sisiMiring = 10;
        kaki.alas = 10;
        kaki.hitungLuas(sisi.alas, Math.sqrt(Math.pow(sisi.sisi, 2) - Math.pow(sisi.alas/2, 2)));
        kaki.hitungKeliling(kaki.alas/2,kaki.sisiMiring);
        
        //Segitiga Sama Sisi
        //Segitiga Sama Sisi
        sisi.sisi = 13;
        sisi.alas = 14;
        sisi.hitungLuas(sisi.alas, Math.sqrt(Math.pow(sisi.sisi, 2) - Math.pow(sisi.alas/2, 2)));
        sisi.hitungKeliling(sisi.alas/2,sisi.sisi);
        
                System.out.println("Persegi");
        System.out.println("Sisi     : " + persegi.sisi + "\n" +
                           "Luas     : " + persegi.luas + "\n" +
                           "Keliling : " + persegi.keliling + "\n");
        System.out.println("Persegi Panjang");
        System.out.println("Panjang  : " + pPanjang.panjang + "\n" +
                           "Lebar    : " + pPanjang.lebar + "\n" +
                           "Luas     : " + pPanjang.luas + "\n" +
                           "Keliling : " + pPanjang.keliling + "\n");
        System.out.println("Segitiga Sama Kaki");
        System.out.println("Alas        : " + kaki.alas + "\n" +
                           "Sisi Miring : " + kaki.sisiMiring + "\n" +
                           "Luas        : " + kaki.luas/2 + "\n" +
                           "Keliling    : " + kaki.keliling + "\n");
        System.out.println("Segitiga Sama Sisi");
        System.out.println("Alas        : " + sisi.alas + "\n" +
                           "Sisi        : " + sisi.sisi + "\n" +
                           "Luas        : " + sisi.luas/2+ "\n" +
                           "Keliling    : " + sisi.keliling + "\n");
    }
}
