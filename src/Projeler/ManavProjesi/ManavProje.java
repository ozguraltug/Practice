package Projeler.ManavProjesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ManavProje {
    /*
 1) urunler String) ve urunfiyatlari double icin ayri list olusturun
 class level da tanimlayiniz static
 main method disinda ama main methoddan call yapcaz
 liste alinan urunleri user a gostermek icin method create edelim
 method--> public static void ürünleriListele(){for i ,
 printl(i+\t +urun\t+fiyat} pmsiz
2)scannner class dan obj create ediniz ürünleriListele() methodu call ediniz
kullanicinin ekrania gosterelim.
3) nasil secim alirim
urunNo giricek kulanici ve urunMiktari giricek yeni variable larimi oldu
urunNo=int , urunMiktari=double
fiyat uyarisi veren bir code yaziniz yani 1000 tl yi asti sepet gibi
4)sepetUrunler list(String), sepetKg(double), sepetFiyat(double)
method-->public static void sepeteEkle(int urunNo,double urunMiktari){
}
? devam mi odemem mi
5) sepetiYazdir methodun create ediniz
method--> public static double(toplamFiyat) sepeteYazdir(){
println(urunler fiyat kg )
}?6) burdan onra ne yapmaliyim
String tipinde secim aliniz e/h olarak
cevap evet ise== do kismi
cevap hayir ise ==while sarti calisisin odeme talep edilsin
7)odeme de neler yapabiliriz
coin kargo (nakit) kartla veresiye
method--> public static void odeme(double toplamFiyat){println()}
   00  Domates           20.10 TL
         01  Patates           30.20 TL
         02  Biber             30.50 TL
         03  Soğan             20.30 TL
         04  Havuç             30.10 TL
         05  Elma               50.20 TL
         06  Muz                 100.90 TL
         07  Çilek              60.10 TL
         08  Kavun              40.30 TL
         09  Üzüm              20.70 TL
         10  Limon             10.50 TL*/
    static List<String> urunler = new ArrayList();
    static List<String> odemeTipleri = new ArrayList();
    static List<Double> fiyatlar = new ArrayList();

    static double sepet = 0;
    static String devamDurumu;

    public static void main(String[] args) {
        urunler.add("Domates");
        urunler.add("Patates");
        urunler.add("Biber");
        urunler.add("Soğan");
        urunler.add("Havuc");
        urunler.add("Elma");
        urunler.add("Muz");
        urunler.add("Cilek");
        urunler.add("Kavun");
        urunler.add("Uzum");
        urunler.add("Limon");
        fiyatlar.add(20.10);
        fiyatlar.add(30.20);
        fiyatlar.add(30.50);
        fiyatlar.add(20.30);
        fiyatlar.add(30.10);
        fiyatlar.add(50.20);
        fiyatlar.add(100.90);
        fiyatlar.add(60.10);
        fiyatlar.add(40.30);
        fiyatlar.add(20.70);
        fiyatlar.add(10.50);
        odemeTipleri.add("coin");
        odemeTipleri.add("kredi kartı");
        odemeTipleri.add("kapida odeme");
        Scanner scan = new Scanner(System.in);
        System.out.println("Urunleri listelemek istiyor musunuz? E/H");
        char listele = scan.next().toLowerCase().charAt(0);
        if (listele == 'e') {
            urunlerilistele();
            do {
                System.out.println("Lutfen eklemek istediginiz urun kodunu giriniz");
                int urunKodu = scan.nextInt();
                if (urunKodu == 8) {
                    System.out.println(urunler.get(urunKodu) + " urununden kac adet almak istiyorsunuz");
                } else if (urunKodu >= 0 || urunKodu <= urunler.size()) {
                    System.out.println(urunler.get(urunKodu) + " urununden kac kg almak istiyorsunuz");
                }


                int urunMiktari = scan.nextInt();
                sepet += fiyatlar.get(urunKodu) * urunMiktari;
                System.out.println("Su an sepetteki urun fiyat miktarı :" + sepet + " TL. Alisverise devam etmek istiyor musunuz?  E/H");
                devamDurumu = scan.next().toLowerCase();

            } while (devamDurumu.equals("e"));
            System.out.println("Lutfen siparisiniz icin adres giriniz");
            scan.nextLine();
            String adres = scan.nextLine();
            System.out.println("Ödeme tiplerinden birini seciniz.");
            odemeTipleriYazdir();
            int odemeKodu = scan.nextInt();
            /*if(odemeKodu==1){
                System.out.println("Lutfen trxcllj adresine ödemeyi yaptıktan sonra ödeme makbuzunuzun resmini ... no lu numaraya mesaj attıktan sonra siparisiniz adresinize gönderilecektir");
            }
            else if(odemeKodu==2){
                System.out.println("Odeme sayfasına yönlendiriliyorsunuz, odeme islemi tamamlandiktan sonra alisverisiniz adresinize yonlendirilecektir.Tesekkur ederiz.İyi Gunler ");
            }*/
            switch (odemeKodu) {
                case 1:
                    System.out.println("Lutfen trxcllj adresine ödemeyi yaptıktan sonra ödeme makbuzunuzun resmini ... no lu numaraya mesaj attıktan sonra siparisiniz adresinize gönderilecektir");
                    break;
                case 2:
                    System.out.println("Odeme sayfasına yönlendiriliyorsunuz, odeme islemi tamamlandiktan sonra alisverisiniz adresinize yonlendirilecektir.Tesekkur ederiz.İyi Gunler ");
                    break;
                case 3:
                    System.out.println("Siparisiniz en kisa zamanda adresinize yonlendirilecektir. Tesekkur ederiz. Iyi gunler");
                    break;
                default:
                    System.out.println("Odeme turu secimini yanlis yaptiniz, alisverise tekrar baslayiniz");
            }


        } else {
            System.out.println("Alisverise devam etmemeyi sectiginiz, Iyi gunler");
        }


    }

    public static void odemeTipleriYazdir() {
        for (int i = 0; i < odemeTipleri.size(); i++) {
            System.out.println(odemeTipleri.get(i) + " ile odemeyi secmek icin " + (i + 1) + " no lu kodu giriniz");

        }
    }


    private static void urunlerilistele() {
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println(i + " kodlu " + urunler.get(i) + " " + fiyatlar.get(i));

        }

    }

}
