/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author yakub
 */
public class Outer {
    static class NestedDemo {
        public void myNetMethod() {
            System.out.println("Ini adalah method " + "static nesred class");
        }
    }
    
    public static void main(String[] args) {
        Outer.NestedDemo nested = new Outer.NestedDemo();
        nested.myNetMethod();
    }
}
