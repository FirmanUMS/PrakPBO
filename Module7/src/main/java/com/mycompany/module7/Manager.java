/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module7;

/**
 *
 * @author yakub
 */
public class Manager extends Karyawan{
    private float jamKerja = 7.5f;
    public float getJamKerja(){
        return jamKerja;
    }
    public void setJamkerja(float jamKerja){
        this.jamKerja = jamKerja;
    }
    
    public float getGajiManager(){
        return getGaji()*2;
    }
    
    
}
