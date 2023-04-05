package Karisik;

public class ThreadExample01 {
static int i,j;


    public static void main(String[] args) {
        Thread t1=new Thread(){
            @Override
            public void run() {
                for(i=0;i<100;i++)
                System.out.println("domatesin uzunluğu "+ i+" cm oldu");
            }
        };

        Thread t2=new Thread(){
            @Override
            public void run() {
                for(j=0;j<100;j++){
                    System.out.println("salatalık "+j+" cm oldu");
                }
            }
        };

        t1.start();
        t2.start();

        }
    }

