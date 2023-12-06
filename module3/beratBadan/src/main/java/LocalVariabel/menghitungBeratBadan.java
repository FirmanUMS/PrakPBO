/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LocalVariabel;

/**
 *
 * @author yakub
 */
public class menghitungBeratBadan {
    int usia = 0;
    public void hitungUsia(){
        int tahunSekarang = 2019;
        int tahunLahir = 1993;
        
        usia = tahunSekarang - tahunLahir;
        
        System.out.println("Usia saya : " + usia);
    }
    public void beratBadan(){
        int beratlahir = 5;
        int berat = 0;
        
        berat = beratlahir + (usia/2);
        
        System.out.println("Berat Badan : " + berat + "Kg");
    }
}