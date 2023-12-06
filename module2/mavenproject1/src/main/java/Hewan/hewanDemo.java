/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hewan;

/**
 *
 * @author yakub
 */
public class hewanDemo {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Hewan();
    
        hewan1.beriNama("Harimau");
        hewan1.beriJumlahKaki(4);
        hewan1.beriMakanan("Daging");
        hewan1.beriType("Karnifora");
        hewan1.infoHewan();
        System.out.println("\n");
        
        hewan2.beriNama("Kerbau");
        hewan2.beriJumlahKaki(4);
        hewan2.beriMakanan("Rumput");
        hewan2.beriType("Herbifora");
        hewan2.infoHewan();
    }
}
