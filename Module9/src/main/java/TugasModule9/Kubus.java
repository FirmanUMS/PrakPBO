/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModule9;

/**
 *
 * @author yakub
 */
public class Kubus extends metodAbstrat{
    int sisi = 25;
    
    public int volume(){
        return sisi*sisi*sisi;
    }
    
    public int LuasPermukaan(){
        return 6*sisi*sisi;
    }
}
