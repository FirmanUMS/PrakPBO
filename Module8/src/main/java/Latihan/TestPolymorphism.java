/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author yakub
 */
public class TestPolymorphism {
    public static void main(String[] args) {
    Kucing k = new Kucing();
    Anjing a = new Anjing();
    
    k.beriNama("TOM");
    System.out.println(k.panggilNama());
    System.out.println(k.perilaku());
    System.out.println(k.suara());
    a.beriNama("BULL");
    System.out.println(a.panggilNama());
    System.out.println(a.perilaku());
    System.out.println(a.suara());
    }
}
