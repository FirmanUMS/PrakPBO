/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module9;

/**
 *
 * @author yakub
 */
public class ObjekAbstrakClass {
    public static void main(String[] args) {
//        AbstrakClass ac = new AbstrakClass(2, 3, 4);
        TurunanAbstrakClass tac = new TurunanAbstrakClass(2, 3, 2);
        tac.printX();
        System.out.println(tac.kali());
           
    }
}
