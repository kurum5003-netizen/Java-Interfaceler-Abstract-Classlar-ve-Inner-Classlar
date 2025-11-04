/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yurtdısıcıkısprogramı;

import java.util.Scanner;

/**
 *
 * @author BERK
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner=new Scanner(System.in);
      Yurtdısıcıkısprogramı yp=new  Yurtdısıcıkısprogramı();
      String message=" yurt dısına çıkabilmek için tüm şartları sağlamadığınız için yurt dışına çıkamazsınız lütfen istenilen tüm belgeleri eksiksiz sağlayın:::::";
      String islemler="1-Harc Kontrol\n" + "2-Vize kontrol\n " +"3-Adli sicil kaydı sorgulama\n" ;
      int a=0;
        while(true){
            System.out.println(islemler);
            System.out.println("harcınız kontrol ediliyor...");
            Thread.sleep(3000);
          if(yp.Harckontrol()){
              a++;
          }
          else{
              System.out.println("yeterli harc miktarı yatırılmamıs!!!");
          }
             System.out.println("vizeniz kontrol ediliyor...");   
             Thread.sleep(3000);
             if(yp.Vizekontrol())   {
                 a++;
             }
             else{
                 System.out.println("istenilen vizeye sahip değilsiniz veya doğrulanamadı!!!");
             }
              System.out.println("adli sicil kaydınız kontrol ediliyor...");  
                Thread.sleep(3000);
               if(yp.Adlisicilkaydıkontrol()) {
                   a++;
               }
               else{
                   System.out.println("istenilen sicil belgeleri dogrulanamadı!!!");
               }
                
               if(a==3) {
                   System.out.println("tüm belgeleriniz doğrulanmıştır iyi yolculuklar");
                   break;
               }
               else{
                   System.out.println(message);
                   break;
               }
            
            
            
        
        }
        
        
        
        
        
        
        
    }
}
