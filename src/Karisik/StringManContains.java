package Karisik;

import java.util.Scanner;

public class StringManContains {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//        System.out.println("Lütfen gmail adresinizi giriniz.");
//        String mail=scan.nextLine();
//        if(!mail.contains("@gmail.com")){
//            System.out.println("Lütfen gmail adresinizi giriniz");
//        }
//       else if(mail.endsWith("gmail.com")){
//            System.out.println("gmail adresiniz kaydedilmiştir.");
//        }
//        else {
//            System.out.println("Lütfen mail adresinizi kontrol ediniz");
//        }


//        Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum

        if(cumle.contains("buyuk")){
//        cumleyi buyuk harf olarak, “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak
//        yazdirin, iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor”
//        yazdirin.
            System.out.println("Bir cümle giriniz");
            String cumle=scan.nextLine();
            System.out.println(cumle.toUpperCase());
        }
        else if(cumle.contains("kucuk")){
            System.out.println(cumle.toLowerCase());

        }
        else{
            System.out.println("Cumle kuçuk buyuk kelmiesi içermiyor");
        }
    }

}
