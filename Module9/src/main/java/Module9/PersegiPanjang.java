/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module9;

/**
 *
 * @author yakub
 */
public class PersegiPanjang extends methodAbstract{
    int panjang=10;
    int lebar=5;
    
    public int luas(){
        return panjang*lebar;
    }
    
    public int keliling(){
        return 2*(panjang+lebar);
    }
    
}
