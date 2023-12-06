/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author yakub
 */
public class AccessKendaraan {
    public static void main(String[] args) {
        Mobil mobil = new Mobil();
        System.out.println("--------------Mobil--------------");
        System.out.println("Bahan Bakar     : " + mobil.bahanBakar + "\n" + 
                           "Tipe            : " + mobil.tipe + "\n" +
                           "Buatan dari     : " + mobil.asal + "\n" +
                           "Jumlah Roda     : " + mobil.jumlahRoda + "\n" +
                           "Berat Max Beban : " + mobil.beban + "kg" + "\n");
    
        Pesawat pesawat = new Pesawat();
        System.out.println("Pesawat");
        System.out.println("Bahan Bakar     : " + pesawat.bahanBakar + "\n" + 
                           "Tahun Pembuatan : " + pesawat.tipe + "\n" +
                           "Baling - baling : " + pesawat.baling2 + "\n" +
                           "Jumlah Roda     : " + pesawat.jumlahRoda + "\n" +
                           "Berat Max Beban : " + pesawat.beban + "kg");
                           
                           
    }
}
