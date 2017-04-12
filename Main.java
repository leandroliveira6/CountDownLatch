package CountDownLatch;

import java.util.concurrent.CountDownLatch;

public class Main{
    public static void main(String args[]) throws InterruptedException{
    	CountDownLatch trava = new CountDownLatch(5);
        for (int i=1; i<6; i++){
        	Tarefa t = new Tarefa(trava, i*100);
        	Thread.sleep(1000); //InterruptedException
            new Thread(t).start();
        }
    }
}