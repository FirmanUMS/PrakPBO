/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paramconstructor;

/**
 *
 * @author yakub
 */
public class Smartphone {
    String merek, tipe;
    
    public Smartphone(){
        this.merek = merek;
        this.tipe = tipe;
    }
    
    public Smartphone(String merek, String tipe){
        this.merek = merek;
        this.tipe = tipe;
    }
    
    public void info(){
        System.out.println("Merek : " + merek + "\nTipe : " + tipe);
    }
}
