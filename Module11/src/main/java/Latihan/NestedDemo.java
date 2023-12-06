/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Latihan;

/**
 *
 * @author yakub
 */
public class NestedDemo {
    public static void main(String[] args) {
        NestedClass.StaticNestedClass staticNested = new NestedClass.StaticNestedClass();
        staticNested.printInfo();
        
        NestedClass.InnerClass dalam = new NestedClass().new InnerClass();
        System.out.println(dalam.getJurusan());
    }
}
