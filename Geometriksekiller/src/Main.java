
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
        String islemler="Karenin alanını hesaplamak için 1 e\n" +
                         "Üçgenin alanını hesaplamk için 2 ye\n" +
                         "Dairenin alanını hesaplamak için 3 e\n" +
                         "çıkış için q ya basın";
        
        System.out.println("************************************");
        System.out.println("Alan hesaplama programına hoşgeldiniz");
        System.out.println("************************************");
        
        while(true){
            Sekil sekil;
            System.out.println(islemler);
            String b=scanner.nextLine();
            
            if(b.equals("q")){
                System.out.println("programdan çıkılıyor...");
                break;
                
            }
            else if(b.equals("1")){
                int a;
                System.out.println("karenin kenarını giriniz:");
                a=scanner.nextInt();
                scanner.nextLine();
                sekil=new Kare("kare",a);
                sekil.Alanhesapla();
            }
            else if(b.equals("2")){
               int a;
               int c;
               int d;
                System.out.println("üçgenin kenarlarını giriniz:");
                a=scanner.nextInt();
                c=scanner.nextInt();
                d=scanner.nextInt();
                scanner.nextLine();
                sekil= new Ucgen("ucgen", a, d, c);
                sekil.Alanhesapla();
          
                
            }
            
            else if(b.equals("3")){
                System.out.println("yarıçapı giriniz:");
                int a=scanner.nextInt();
               scanner.nextLine();
                sekil=new Daire("daire", a);
                sekil.Alanhesapla();
                
                
                
            }
            
            
            
        }
        
        
        
        
        
        
        
        
     
        
    }
           
            
}
