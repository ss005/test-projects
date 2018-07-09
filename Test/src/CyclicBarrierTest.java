import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        CyclicBarrier barrier = new CyclicBarrier(5, () -> System.out.println(" All parties reached the barrier ..."));

        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new Worker4("t-" + i, barrier));
            t.start();
        }

//        System.out.println("barrier is " + barrier.getParties());
//        System.out.println("resetting the barrier ");
//        System.out.println(barrier.getParties());
    }
}

class Worker4 implements Runnable {

    private String name;
    private CyclicBarrier barrier;

    public Worker4(String name, CyclicBarrier barrier) {
        this.name = name;
        this.barrier = barrier;
    }

    @Override
    public void run() {
        try {
            //Thread.sleep(2000);
            System.out.println("thread " + Thread.currentThread().getName() + " is going to wait at barrier for other "
                    + (barrier.getParties() - 1) + " parties ...");
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        //System.out.println();
        //System.out.println("all parties reached... Now time to start the actual job ...");
        System.out.println("thread " + Thread.currentThread().getName() + " started the work ....");
        //System.out.println("thread " + Thread.currentThread().getName() + " is going to sleep fo 2 seconds...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
    }
}