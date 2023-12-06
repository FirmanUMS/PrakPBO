/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author yakub
 */
public class NestedClass {
    String nama = "Yakub Firman Mustofa";
    String nim = "L200220036";
    
    public void printNama() {
        System.out.println(nama + " : " + nim );
    }
    
    static class StaticNestedClass {
        static String jurusan = "Teknik Informatika";
        
        NestedClass outer = new NestedClass();
        public void printInfo() {
            outer.printNama();
        }
    }
    
    class InnerClass {
        public String getJurusan() {
            return StaticNestedClass.jurusan;
        }
    }
}
