package HRank;

import java.util.Scanner;

public class P05_JavaLoops01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Çarpım tablosu içn bir sayı giriniz ");
        int n=scan.nextInt();

        for(int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(i*n));
        }
    }
}
