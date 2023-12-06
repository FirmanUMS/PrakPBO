/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan3;

/**
 *
 * @author yakub
 */
public class Pegawai {
    String nama;
    int nip;
    double gaji;
    
    void beriNama(String namaPegawai){
        nama = namaPegawai;
    }
    
    void beriNIP(int nipPegawai){
        nip = nipPegawai;
    }
    
    void beriGaji(double gajiPegawai){
        gaji = gajiPegawai;
    }
    
    void tampil(){
        System.out.println(
        "Nama : " + nama + "\n" +
        "NIP : " + nip + "\n" +
        "Gaji : " + gaji + "Juta" + "\n");
    }
}
