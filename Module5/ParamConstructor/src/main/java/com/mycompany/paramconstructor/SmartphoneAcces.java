/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paramconstructor;

/**
 *
 * @author yakub
 */
public class SmartphoneAcces {
    public static void main(String[] args) {
        Smartphone HP =  new Smartphone("POCO", "M3 PRO 5G");
        HP.info();
        
        Smartphone HP1 = new Smartphone();
        HP1.merek = "OPPO";
        HP1.tipe = "A53";
        HP1.info();
    }
}
