/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10;

import java.util.Scanner;

/**
 *
 * @author yakub
 */
public class AplikasiLampu {
    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        Scanner sc = new Scanner(System.in);
        lampu.statusLampu = lampu.setSaklar(0);
        System.out.println("Status lampu = " + lampu.statusLampu + "\nketikkan");
        System.out.println("1 untuk menyalakan lampu\n0 untuk mematikan lampu\n2 untuk meredupkan lampu");
        
        int x = sc.nextInt();
        if(lampu.setSaklar(x)==0){
            lampu.matikanLampu();
        } else if(lampu.setSaklar(x)==1){
            lampu.hidupkanLampu();
        } else {
            lampu.redupkanLampu();
        }
    }
}
