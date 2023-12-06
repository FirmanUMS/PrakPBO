/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.module10;

/**
 *
 * @author yakub
 */
public interface ActivityLampu {
    public static final int LAMPU_HIDUP = 1;
    public static final int LAMPU_MATI = 0;
    public static final int LAMPU_REDUP = 2;
    public abstract void matikanLampu();
    public abstract void hidupkanLampu();
    public abstract void redupkanLampu();
}