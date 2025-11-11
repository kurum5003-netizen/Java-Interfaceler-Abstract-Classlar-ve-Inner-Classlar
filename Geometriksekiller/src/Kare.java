/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BERK
 */
public class Kare extends Sekil {
    private int kenar;
    public Kare(String isim,int kenar){
        super(isim);
        this.kenar=kenar;
    }

    @Override
    void Alanhesapla() {
        System.out.println(getIsim() + "\tAlan:"+(kenar*kenar));
    }
    
    
    
}
