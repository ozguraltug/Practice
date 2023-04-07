package Karisik;

public class ThreadExample03 {
static int i,j;
    public static void main(String[] args) {

        Thread th1=new Thread(){
            @Override
            public void run() {

                    try {
                        for(i=1;i<100;i++){
                            System.out.println("domatesin boyu "+i+" cm oldu. ");
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

                    try {for(j=1;j<100;j++) {
                        System.out.println("Salatalığın boyu " + j + " cm oldu. ");
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
