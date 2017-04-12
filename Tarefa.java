package CountDownLatch;

import java.util.concurrent.CountDownLatch;

class Tarefa implements Runnable{
        CountDownLatch trava;
        int id;
 
        public Tarefa(CountDownLatch trava, int id){
            this.trava = trava;
            this.id = id;
        }
 
        public void run(){
        	trava.countDown(); //decrementa count
        	System.out.println("["+id+"] Tarefa iniciada! (DEBUG GETCOUNT()="+trava.getCount()+")");
        	try {
				trava.await(); //InterruptedException
				System.out.println("["+id+"] Rodando...");
	            Thread.sleep(id*10); //InterruptedException
	            System.out.println("["+id+"] Terminou!");
			} catch (InterruptedException e) {
				System.exit(1);
			}
        }
    }