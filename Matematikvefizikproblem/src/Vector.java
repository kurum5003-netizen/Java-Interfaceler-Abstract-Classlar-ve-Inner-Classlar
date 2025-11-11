
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BERK
 */
public class Vector {
    private int i;
    private int j;
    private int k;
    private String isim;
    public Vector(String isim){
        Scanner scanner=new Scanner(System.in);
        this.isim=isim;
        System.out.println("i vektörü:");
        this.i=scanner.nextInt();
        System.out.println("j vektörü:");
        this.j=scanner.nextInt();
        System.out.println("k vektörü:");
        this.k=scanner.nextInt();
        
        
    }

    
    public int getI() {
        return i;
    }

    
    public void setI(int i) {
        this.i = i;
    }

   
    public int getJ() {
        return j;
    }

    
    public void setJ(int j) {
        this.j = j;
    }

   
    public int getK() {
        return k;
    }

    
    public void setK(int k) {
        this.k = k;
    }

    
    public String getIsim() {
        return isim;
    }

    
    public void setIsim(String isim) {
        this.isim = isim;
    }
    
    
    
    
    
    
}
