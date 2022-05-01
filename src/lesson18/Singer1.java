package lesson18;

public class Singer1 extends Thread{

    private boolean needStop = false;

    @Override
    public void run() {
        int count = 0;
        while (!needStop){
            //считаем круги
            count++;
            if (count>3){
                needStop = true;
            }

            for (int i = 0; i <3; i++){
                System.out.println("lA -------");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //разбудили 2 певца
            synchronized (Monitors.MIKROFON){
                Monitors.MIKROFON.notify();
            }

            //а сами заснули

            synchronized (Monitors.MIKROFON){
                try {
                    Monitors.MIKROFON.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
