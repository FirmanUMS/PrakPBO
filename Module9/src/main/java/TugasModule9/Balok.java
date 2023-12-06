/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModule9;

/**
 *
 * @author yakub
 */
public class Balok extends metodAbstrat{
    int p = 10;
    int l = 6;
    int t = 8;
    
    public int volume(){
        return p*l*t;
    }
    
    public int LuasPermukaan(){
        return 2*(p*l + p*t + l*t);
    }
}
