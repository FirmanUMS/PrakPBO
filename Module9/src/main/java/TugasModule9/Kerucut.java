/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModule9;

/**
 *
 * @author yakub
 */
public class Kerucut extends metodAbstrat{
    int phi = 22/7;
    int r = 7;
    int t = 10;
    int s = 15;

    @Override
    public int volume() {
        return (phi*r*r)/3;
    }

    @Override
    public int LuasPermukaan() {
        return phi*r*(r+s);
    }
}
