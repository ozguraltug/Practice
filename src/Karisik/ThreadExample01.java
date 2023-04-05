package Karisik;

public class ThreadExample01 {
static int i,j;
    public static void main(String[] args) {
Thread t1=new Thread(){
    @Override
    public void run() {
        for(i=1;i<100;i++){
            try {
                System.out.println("Domatesin boyu "+i+" cm oldu, büyüyor");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
};
Thread t2=new Thread(){
    @Override
    public void run() {
        for(j=1;j<100;j++){
            try { System.out.println("Salatalığın boyu "+j+" cm oldu");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
};


  t1.start();
  t2.start();
    }

    }

