import java.util.LinkedList; import java.util.Queue;
public class ProducerConsumer {
    private final Queue<Integer> q = new LinkedList<>(); private final int CAP=5;
    class Producer extends Thread { public void run(){ for(int i=1;i<=10;i++){ synchronized(q){ while(q.size()==CAP){ try{ q.wait(); }catch(InterruptedException ignored){} } q.add(i); System.out.println("Produced: "+i); q.notifyAll(); } } } }
    class Consumer extends Thread { public void run(){ for(int i=1;i<=10;i++){ synchronized(q){ while(q.isEmpty()){ try{ q.wait(); }catch(InterruptedException ignored){} } int v=q.remove(); System.out.println("Consumed: "+v); q.notifyAll(); } } } }
    public static void main(String[] args) throws InterruptedException { ProducerConsumer pc=new ProducerConsumer(); Thread p=pc.new Producer(); Thread c=pc.new Consumer(); p.start(); c.start(); p.join(); c.join(); }
}
