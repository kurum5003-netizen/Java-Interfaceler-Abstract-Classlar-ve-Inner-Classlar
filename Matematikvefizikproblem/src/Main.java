
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BERK
 */
public class Main {
    public static void main(String[] args){
    Scanner scanner =new Scanner(System.in);
    String islem="Dairenin alanını hesaplamak için 1 e\n" +
                     "Üçgenin çevresini hesaplamak için 2'ye\n" +
                      "2 vektörün çarpımı için 3 e\n"+
                      "çıkış için q ya basın";
    
        System.out.println("*****************************");
        System.out.println("Matematik ve Fizik Problemlerine hoşgeldiniz");
        System.out.println("*****************************");
        while(true) {
            System.out.println(islem);
            String a=scanner.nextLine();
            if(a.equals("q")){
                System.out.println("çıkış yapılıyor...");
                break;
            }
            else if(a.equals("1")){
                System.out.println("yarıçapı giriniz:");
                int b=scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.daireninalanı(b);
                
            }
            else if(a.equals("2")){
                int b,c,d;
                System.out.println("üçgenin kenarlarını sırayla giriniz:");
                b=scanner.nextInt();
                c=scanner.nextInt();
                d=scanner.nextInt();
                scanner.nextLine();
                Problem.Matematik.üçgeninçevresi(d, b, c);
                
                
                
            }
            else if(a.equals("3")){
               Vector vec1=new Vector("A VEKTÖRÜ") ;
               Vector vec2=new Vector("B VEKTÖRÜ");
               
               Problem.Fizik.vektör_çarpımı(vec1, vec2);
                
                
                
                
                
                
            }
            
            
            
            
            
            
            
        }
     
    
    
    
    
    
    
    
    
    
    
    
    
            }
}
