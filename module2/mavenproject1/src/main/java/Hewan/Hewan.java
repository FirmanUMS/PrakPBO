/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author yakub
 */
public class Hewan {
    String namaHewan;
    int jumlahKaki;
    String makanan;
    String typeHewan;
    
    void beriNama(String nama){
        namaHewan = nama;
    }
    
    void beriJumlahKaki(int kaki){
        jumlahKaki = kaki;
    }
    
    void beriMakanan(String makananHewan){
        makanan = makananHewan;
    }
    
    void beriType(String tipeHewan){
        typeHewan = tipeHewan;
    }
    
    void infoHewan(){
        System.out.println(
        "Nama Hewan : " + namaHewan + "\n" +
        "Jumlah Kaki : " + jumlahKaki + "\n" +
        "Makanan : " + makanan + "\n" +
        "Type Hewan : " + typeHewan 
        );
    }
}
