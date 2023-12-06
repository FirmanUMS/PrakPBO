/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paramconstructor;

/**
 *
 * @author yakub
 */
public class BukuAcces {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Yakub", "Kisah Nabi Yakub ", 50000);
        buku1.info();
        
        Buku buku2 = new Buku("Firman","Filsafat Firman Tuhan", 2021, 30000);
        buku2.info();
        
        Buku buku3 = new Buku("Mustofa", "Muhammad yang Terpiling", 2023, 12, 75000);
        buku3.info();
        
        Buku buku4 = new Buku("Khoirul ", "Kisah Anak Yatim kaya", 60000);
        buku4.info();
        
        Buku buku5 = new Buku("Abdillah","Bagaimana Tuhan Berbicara", 2009, 150000);
        buku5.info();
        
        Buku buku6 = new Buku("Inandra", "Negeri Selokan", 2020, 1, 85000);
        buku6.info();
        
        Buku buku7 = new Buku("Asha", "Umar Singa Padang pasir", 50000);
        buku7.info();
        
        Buku buku8 = new Buku("Raihan","Kisah Cinta Rehan", 2023, 1000000);
        buku8.info();
        
        Buku buku9 = new Buku("Mukhorobun", "Penaklukan Andalusia", 2010, 5, 200000);
        buku9.info();
        
        Buku buku10 = new Buku("Yakub Firman Mustofa", "21 Tahun Menjembol Tembok Konstantinopel", 2024, 4, 150000);
        buku10.info();
        
    }
    
    
}
