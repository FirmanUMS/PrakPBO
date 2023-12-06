/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Percobaan;

/**
 *
 * @author yakub
 */
public class OuterDemo {
        int num;
    
    private class InnerDemo {
        private void print() {
            System.out.println("Ini merupakan method inner class");
        }
    }
    
    void displayInner() {
        InnerDemo inner = new InnerDemo();
        inner.print();
    }
}
