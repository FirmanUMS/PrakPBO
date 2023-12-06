/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author yakub
 */
public class OuterDemoMain {
    public static void main(String[] args) {
        OuterDemo2 outer = new OuterDemo2();
        
        OuterDemo2.Inner_Demo inner = outer.new Inner_Demo();
        
        System.out.println(inner.getNum());
    }
}
