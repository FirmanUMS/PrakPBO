/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModule9;

/**
 *
 * @author yakub
 */
public class Bola extends metodAbstrat{
    int r = 14;
    int phi = 22/7;

    @Override
    public int volume() {
        return 4/3*(phi*r*r*r);
    }

    @Override
    public int LuasPermukaan() {
        return 4*phi*r*r;
    }    
}
