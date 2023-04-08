package Karisik;

public class Threadexamples implements Runnable{

    public static void main(String[] args) {
        Thread th1=new Thread(new Threadexamples("biber"));
        Thread th2=new Thread(new Threadexamples("domates"));
th1.start();
th2.start();
    }
    String name;
    public Threadexamples(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        System.out.println("Bahçede "+this.name+" sulandı");

            try {
                for (int i=1;i<=100;i++) {
                    System.out.println(this.name + " boyu " + i + " cm oldu.");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }


    }
}