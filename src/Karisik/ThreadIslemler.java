package Karisik;

public class ThreadIslemler implements Runnable {
    String name;
    public ThreadIslemler(String name) {
        this.name = name;
    }




    @Override
    public void run() {

            try { for (int i=1;i<100;i++){
                System.out.println(this.name+" "+i+" cm oldu");
                Thread.sleep(500);}
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }

