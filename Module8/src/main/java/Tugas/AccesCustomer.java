/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author yakub
 */
public class AccesCustomer {
    public static void main(String[] args) {
        Customerdata C1 = new Customerdata("Yakub", "Surakarta", "10 oct 2002", "swasta", 3200000);
        Customerdata C2 = new Customerdata("Firman", "Jawa Timur", "5 nov 2002", "swasta", 3200000);
        Customerdata C3 = new Customerdata("Mustofa", "sukoharjo", "11 des 2002", "swasta", 3200000);
        Customerdata C4 = new Customerdata("Khoirul", "klaten", "10 jan 2002", "swasta", 3200000);
        Customerdata C5 = new Customerdata("Abidllah", "boyolali", "30 sep 2002", "swasta", 3200000);
        Customerdata C6 = new Customerdata("Inandra", "medaen", "10 apr 2002", "swasta", 3200000);
        Customerdata C7 = new Customerdata("ahsa", "karanganyar", "15 jul 2002", "swasta", 3200000);
        Customerdata C8 = new Customerdata("Fardhana", "ngawi", "27 aug 2002", "swasta", 3200000);
        Customerdata C9 = new Customerdata("Rehan", "kediri", "15 jun 2002", "swasta", 3200000);
        Customerdata C10 = new Customerdata("Mukhorobun", "bojonegoro", "10 Oktober 2002", "swasta", 3200000);
        
        C1.info();
        C2.info();
        C3.info();
        C4.info();
        C5.info();
        C6.info();
        C7.info();
        C8.info();
        C9.info();
        C10.info();
    }
}
