package Karisik;

public class deneme {
    static int i,j;

    public static void main(String[] args) {
        System.out.println("Bahçe Sulandı, bitkilerde büyüme nasıl olacak?");
        Thread th1=new Thread(){
            @Override
            public void run() {

                    try {
                        for(i=1;i<=100;i++) {
                            System.out.println(i + ". günün sonunda domates " + i + " cm oldu");
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

        };
        Thread th2=new Thread(){
            @Override
            public void run() {

                    try {
                        for(j=1;j<=100;j++) {

                            System.out.println(j + ". günün sonunda salatalık " + j + " cm oldu");
                            Thread.sleep(500);
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

            }
        };


th1.start();
th2.start();



    }

}
