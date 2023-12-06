/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module9;

/**
 *
 * @author yakub
 */
public class MethodMain {
    public static void main(String[] args) {
        Persegi psg = new Persegi();
        System.out.println("Keliling = "+psg.getKeliling());
        System.out.println("Luas = "+psg.getLuas());
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.println("\nKeliling Persegi P = " +pp.getKeliling()+ 
                           "\nLuas Persegi Panjang = " + pp.getLuas());
        
        JajarGenjang jg = new JajarGenjang();
        System.out.println("\nKeliling Jajar Genjang= " +jg.getKeliling()+ 
                           "\nLuas Jajar Genjang = " + jg.getLuas());
        
        Lingkaran lk = new Lingkaran();
        System.out.println("\nKeliling Lingkaran = " + lk.getKeliling()+ 
                           "\nLuas Lingkaran = " + lk.getLuas());
        
        SegiTiga st = new  SegiTiga();
        System.out.println("\nKeliling Segi Tiga = " + st.getKeliling()+ 
                           "\nLuas Segi Tiga = " + st.getLuas());
    }
}
