/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Module9;

/**
 *
 * @author yakub
 */
public class TurunanAbstrakClass extends AbstrakClass{
    int x;
    public TurunanAbstrakClass (int a, int b, int c){
        super(a, b, c);
        x = a+b+c;
    }
    
    public void printX(){
        System.out.println(x);
    }
}
