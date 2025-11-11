/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BERK
 */
public class Problem {
    public static class Matematik {
        public static void daireninalanı(int yarıçap){
            
            System.out.println("Dairenin alanı:" + Math.PI*yarıçap*yarıçap);
            
            
        }
        public static void üçgeninçevresi(int a,int b,int c){
            int d=a+b+c;
            
            System.out.println("Üçgenin çevresi:" + d);
            
            
            
            
        }
        
        
        
        
        
    }
    
    public static class Fizik{
        
        public static void vektör_çarpımı(Vector vec1,Vector vec2){
           
          int iccarpım=vec1.getI()*vec2.getI() + vec1.getJ()*vec2.getJ() + vec1.getK()*vec2.getK();
            
            System.out.println(iccarpım);
            
            
            
            
        }
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
    
    
    
 
    
}
