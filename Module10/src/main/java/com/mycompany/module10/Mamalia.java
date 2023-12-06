/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10;

/**
 *
 * @author yakub
 */
public class Mamalia implements ActivityAnimal{

    @Override
    public void eat() {
        System.out.println("Mamal eats");
    }

    @Override
    public void travel() {
        System.out.println("Mamal travels");
    }
    public int noOfLegs(){
        return 0;
    }
    
    public static void main(String[] args) {
        Mamalia m = new Mamalia();
        m.eat();
        m.travel();
    }
    
}
