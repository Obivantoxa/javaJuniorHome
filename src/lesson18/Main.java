package lesson18;

public class Main {
    public static void main(String[] args) {
        SecondThread secondThread = new SecondThread();
        secondThread.start();

        Thread nyThread = new Thread(new MyThread());
        nyThread.start();



        for (int i = 0; i<10; i++){
            System.out.println(i+ " ---- " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
