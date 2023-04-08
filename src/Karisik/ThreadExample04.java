package Karisik;

public class ThreadExample04 implements Runnable{

    public static void main(String[] args) {

        Thread th1=new Thread(new ThreadExample04("Domates"));
        Thread th2=new Thread(new ThreadExample04("Salatalık"));
        th1.start();
        th2.start();

    }
    String name;
    public ThreadExample04(String name) {
        this.name = name;
    }



    @Override
    public void run() {

            try {for(int i=1;i<=100;i++) {

                System.out.println(this.name + " boyu " + i + " cm oldu");
                Thread.sleep(500);
            }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }



    }
}
