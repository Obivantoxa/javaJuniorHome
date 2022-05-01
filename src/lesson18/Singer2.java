package lesson18;

public class Singer2 extends Thread{
    @Override
    public void run() {
        while (true){
            //спим тут пока первый поет и не дакажет нам notify
            synchronized (Monitors.MIKROFON){
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
// дальше наше соло
            for (int i = 0; i <2; i++){
                System.out.println("------- FA");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //разбудили 1 певца
            synchronized (Monitors.MIKROFON){
                Monitors.MIKROFON.notify();
            }
        }
    }
}


