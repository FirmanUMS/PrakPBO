/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module7;

/**
 *
 * @author yakub
 */
public class KaryawanDemo {
    public static void main(String[] args) {
        Karyawan k1 = new Karyawan();
        k1.setNama("Luffy");
        k1.setGaji(2500000);
        k1.setUsia(21);
        
        System.out.println(k1.getNama());
        System.out.println(k1.getGaji());
        System.out.println(k1.getUsia());
        System.out.println("\n");
        
        Manager M1 = new Manager();
        M1.setNama("Yakub");
        M1.setGaji(2500000);
        M1.setUsia(25);
        M1.setJamkerja(8.5f);

        
        System.out.println("Nama      : " + M1.getNama());
        System.out.println("Gaji      : " + M1.getGajiManager());
        System.out.println("Usia      : " + M1.getUsia());
        System.out.println("Jam Kerja : " + M1.getJamKerja()+ "\n");
        
        Manager M2 = new Manager();
        M2.setNama("Firman");
        M2.setGaji(3000000);
        M2.setUsia(21);
        
        System.out.println("Nama      : " + M2.getNama());
        System.out.println("Gaji      : " + M2.getGajiManager());
        System.out.println("Usia      : " + M2.getUsia());
        System.out.println("Jam Kerja : " + M2.getJamKerja()+ "\n");
        
        Manager M3 = new Manager();
        M3.setNama("Mustofa");
        M3.setGaji(1200000);
        M3.setUsia(25);
        M3.setJamkerja(8.5f);
        
        System.out.println("Nama      : " + M3.getNama());
        System.out.println("Gaji      : " + M3.getGajiManager());
        System.out.println("Usia      : " + M3.getUsia());
        System.out.println("Jam Kerja : " + M3.getJamKerja()+ "\n");
        
        Manager M4 = new Manager();
        M4.setNama("Al-Fatih");
        M4.setGaji(4500000);
        M4.setUsia(27);
        
        System.out.println("Nama      : " + M4.getNama());
        System.out.println("Gaji      : " + M4.getGajiManager());
        System.out.println("Usia      : " + M4.getUsia());
        System.out.println("Jam Kerja : " + M4.getJamKerja()+ "\n");
        
        Manager M5 = new Manager();
        M5.setNama("Muhammad");
        M5.setGaji(3500000);
        M5.setUsia(21);
        M5.setJamkerja(8.5f);
        
        System.out.println("Nama      : " + M5.getNama());
        System.out.println("Gaji      : " + M5.getGajiManager());
        System.out.println("Usia      : " + M5.getUsia());
        System.out.println("Jam Kerja : " + M5.getJamKerja()+ "\n");
    }
    
}
