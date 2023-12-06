/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paramconstructor;

/**
 *
 * @author yakub
 */
public class Buku {
    String namaPengarang, judulBuku;
    int tahunTerbit, cetakanKe;
    double hargaJual;
    
    public Buku(String namaPengarang, String judulBuku, double hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.hargaJual = hargaJual;
    }
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, double hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.hargaJual = hargaJual;
    }
    public Buku(String namaPengarang, String judulBuku, int tahunTerbit, int cetakanKe, double hargaJual){
        this.namaPengarang = namaPengarang;
        this.judulBuku = judulBuku;
        this.tahunTerbit = tahunTerbit;
        this.cetakanKe = cetakanKe;
        this.hargaJual = hargaJual;
    }
    
    public void info(){
        System.out.println(
                "Nama Pengarang : " + namaPengarang +
                "\nJudul Buku : " + judulBuku +
                "\nTahun Terbit : " + tahunTerbit +
                "\nCetakan Ke : " + cetakanKe +
                "\nHarga Jual : " + hargaJual + "\n"       
        );
    }
    
    
}
