/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author yakub
 */
public class BankAccess {
    public static void main(String[] args) {
        Bank b = new Bank();
        BankPribadi pri = new BankPribadi();
        BankUmum um = new  BankUmum();
        BankPasar pas = new BankPasar();
        BankSyariah sya = new BankSyariah();
        
        System.out.println(b.rasioBunga(5));
        System.out.println(pri.rasioBunga(10));
        System.out.println(um.rasioBunga(15));
        System.out.println(pas.rasioBunga(2));
        System.out.println(sya.rasioBunga(0));
        
        
                


    }
}
