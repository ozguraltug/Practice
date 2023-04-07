package Karisik;

public class ThreadExample02 {

    public static void main(String[] args) {
        ThreadIslemler islem1=new ThreadIslemler("domates");
        Thread th1=new Thread(islem1);
        ThreadIslemler islem2=new ThreadIslemler("salatalık");
        Thread th2=new Thread(islem2);
        ThreadIslemler islem3=new ThreadIslemler("biber");
        Thread th3=new Thread(islem3);

        th1.start();
        th2.start();
        th3.start();
    }


}
