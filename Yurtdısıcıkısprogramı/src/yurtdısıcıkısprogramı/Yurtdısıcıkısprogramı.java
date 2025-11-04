/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yurtdısıcıkısprogramı;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Yurtdısıcıkısprogramı implements Test{
    private int harc;
    private boolean adlisicil;
    private boolean vize;
    
    public Yurtdısıcıkısprogramı(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("yatırdığınız harc tutarını giriniz");
           harc=scanner.nextInt();
           scanner.nextLine();
        System.out.println("adli sicil kaydınız var mı?(evet ya da hayır)");
      String  a=scanner.nextLine();
     a= a.toLowerCase();
        if(a.equals("evet")){
            adlisicil=true;
        }
        else{
            adlisicil=false;
        }
        System.out.println("vizeniz var mı?(evet ya da hayır");
        String b=scanner.nextLine();
       b= b.toLowerCase();
         if(b.equals("evet")){
             vize=true;
         }
         else{
             vize=false;
             
         }
        
    }
    
    

    @Override
    public boolean Vizekontrol() {
       if(vize){
           System.out.println("vizeniz başarıyla doğrulanmıştır...");
           return true;
       }
       else{
           return false;
       }
        
        
    }

    @Override
    public boolean Harckontrol() {
       if(harc>=15000){
           System.out.println("harc miktarınız kontrol edilip dogrulanmıstır...");
          return true;
       }
       else{
           return false;
       }
        
        
        
    }

    @Override
    public boolean Adlisicilkaydıkontrol() {
         if(adlisicil){
           System.out.println("adli sicil kaydınız başarıyla doğrulanmıştır...");
           return true;
       }
       else{
          return false;
       }
        
    }

    
    
    
}
