/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModule9;


/**
 *
 * @author yakub
 */
public class MethodMain {
    public static void main(String[] args) {
        Balok bl = new Balok();
        System.out.println("\nVolume Balok = " +bl.getVolume()+ 
                           "\nLuas Pemukaan Balok= " + bl.getLuasPermukaan());
        
        Kubus kb = new Kubus();
        System.out.println("\nVolume Kubus = " + kb.getVolume()+ 
                           "\nLuas Pemukaan Kubus= " + kb.getLuasPermukaan());
        
        Bola bo = new Bola();
        System.out.println("\nVolume Bola = " +bo.getVolume()+ 
                           "\nLuas Pemukaan Bola = " + bo.getLuasPermukaan());
        
        Kerucut kr = new Kerucut();
        System.out.println("\nVolume Kerucut = " + kr.getVolume()+ 
                           "\nLuas Pemukaan Kerucut = " + kr.getLuasPermukaan());
        
        PrismaSegiTiga psg =new PrismaSegiTiga();
        System.out.println("\nVolume Prisma Segi Tiga= " + psg.getVolume()+ 
                           "\nLuas Pemukaan Prisma Segi Tiga= " + psg.getLuasPermukaan());
    }
}
