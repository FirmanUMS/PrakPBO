/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas.Bangundatar;

/**
 *
 * @author yakub
 */
public class BangunDatar {
    double luas;
    double keliling;
    
    void hitungLuas(double lebar, double panjang) {
        this.luas = lebar * panjang ;
    }
    double hitungKeliling(double lebar, double panjang) {
        this.keliling = 2 * (lebar + panjang);
        return keliling;
    }
}
