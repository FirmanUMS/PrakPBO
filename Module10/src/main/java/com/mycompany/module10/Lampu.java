/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10;

/**
 *
 * @author yakub
 */
public class Lampu implements ActivityLampu{
    public int statusLampu;
    
    @Override
    public void matikanLampu() {
        if (statusLampu == 0){
            System.out.println("Lampu sudah dalam kondisi mati");
        }
        else if (statusLampu == 1){
            statusLampu = -1;
            System.out.println("Lampu sudah dimatikan");
        }
    }

    @Override
    public void hidupkanLampu() {
        if (statusLampu == 1){
            System.out.println("Lampu sudah dinyalakan\n***");
        }
        else {
            statusLampu = +1;
            System.out.println("Lampu sudah dalam kondisi menyala");
        }
    }
    @Override
    public void redupkanLampu() {
        if(statusLampu==2) {
            System.out.println("Lampu telah meredup\n===");
        } else {
            statusLampu=+2;
            System.out.println("Lampu meredup karena hampir rusak");
        }
    }
    
    public int setSaklar(int saklar){
       return statusLampu =  saklar;
    }

    
    
}
