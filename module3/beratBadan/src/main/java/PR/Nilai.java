/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PR;

/**
 *
 * @author yakub
 */
public class Nilai {
    int nilaiUTS;
    int nilaiUAS;
    int nilaiTugas;
    
    void beriuts(int uts){
        nilaiUTS = uts;
    }
    
    void beriuas(int uas){
        nilaiUAS = uas;
    }
    
    void beritugas(int tugas){
        nilaiTugas = tugas;
    }
    
    double nilaiTotal(){
    double UTS = nilaiUTS;
    double UAS = nilaiUAS;
    double tugas = nilaiTugas;
    
    double nilaiTotal = (UTS  + UAS + tugas)/3;
    return nilaiTotal;
            
    }


}
