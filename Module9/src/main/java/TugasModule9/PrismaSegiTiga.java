/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasModule9;

/**
 *
 * @author yakub
 */
public class PrismaSegiTiga extends metodAbstrat{
    int alas = 4;
    int tinggi = 10;
    int tinggiPrisma = 15;
    @Override
    public int volume() {
        return ((alas*tinggi)/2)*tinggiPrisma;
    }

    @Override
    public int LuasPermukaan() {
        return (3*alas*tinggiPrisma)*(2*(alas*tinggi));
    }
    
}
