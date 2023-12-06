/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Roti;

/**
 *
 * @author yakub
 */
public class RotiDemo {
    public static void main(String[] args) {
        Roti roti = new Roti();
        roti.beriwarna("Hijau");
        roti.beriRasa("Pandan");
        roti.timbangBerat(30);
        roti.hargaJual(6000);
        roti.infoRoti();
        System.out.println("\n");
        
        Roti roti1 = new Roti();
        roti1.beriwarna("Coklat");
        roti1.beriRasa("Coklat");
        roti1.timbangBerat(35);
        roti1.hargaJual(6500);
        roti1.infoRoti();
        System.out.println("\n");
        
        Roti roti2 = new Roti();
        roti2.beriwarna("Putih");
        roti2.beriRasa("Keju");
        roti2.timbangBerat(30);
        roti2.hargaJual(6500);
        roti2.infoRoti();
        System.out.println("\n");
        
        Roti roti3 = new Roti();
        roti3.beriwarna("Merah");
        roti3.beriRasa("Straubery");
        roti3.timbangBerat(35);
        roti3.hargaJual(7000);
        roti3.infoRoti();
        System.out.println("\n");
    }
    
}
