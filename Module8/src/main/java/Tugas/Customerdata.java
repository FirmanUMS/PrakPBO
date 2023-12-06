/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author yakub
 */
import java.util.Date;
public class Customerdata {
    String nama, alamat, pekerjaan;
    String tanggalLahir;
    double gaji;
    
    public Customerdata(){
        
    }
    
    public Customerdata(String nama, String alamat, String tanggalLahir, String pekerjaan, double gaji){
        this.nama = nama;
        this.alamat = alamat;
        this.tanggalLahir = tanggalLahir;
        this.pekerjaan = pekerjaan;
        this.gaji = gaji;
    }
    
    public void info(){
        System.out.println( "Nama : " + nama + 
                            "\nAlamat :" + alamat + 
                            "\nTanggal Lahir : " + tanggalLahir +
                            "\nPekerjaan : " + pekerjaan +
                            "\nGaji : " + gaji + "\n");
    }
}
