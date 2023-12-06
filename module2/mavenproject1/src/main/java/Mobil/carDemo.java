/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mobil;

/**
 *
 * @author yakub
 */
public class carDemo {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car();
        
        car1.changeCadance(50);
        car1.speedUp(20);
        car1.changeGear(2);
        car1.printInfo();
        
        car2.changeCadance(30);
        car2.speedUp(10);
        car2.changeGear(1);
        car2.printInfo();
       
    }
}
