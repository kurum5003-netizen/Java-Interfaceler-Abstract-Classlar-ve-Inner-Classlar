/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BERK
 */
public class Daire extends Sekil {
    private int yarıçap;
    public Daire(String isim,int yarıçap){
        super(isim);
        this.yarıçap=yarıçap;
        
        
        
    }
    
    @Override
    void Alanhesapla(){
        
        System.out.println(getIsim()+"\tnın alanı:" + Math.PI*yarıçap*yarıçap);
        
    }
    
    
}
