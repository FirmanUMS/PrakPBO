/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kucing;

/**
 *
 * @author yakub
 */
public class kucing {
    int umur;
    String warnabulu;
    String meong;
    
    void beriUmur(int umurKucing){
        umur = umurKucing;
    }
    
    void beriWarna(String warnaKucing){
        warnabulu = warnaKucing;
    }
    
    void beriMeong(String meongKucing){
        meong = meongKucing;
    }
    
    void infoKucing(){
        System.out.println(
        "Umur Kucing : " + umur + " Bulan" + "\n" +
        "Warna Bulu : " + warnabulu + "\n" +
        "Meong Kucing : " + meong
        );
    }
}
