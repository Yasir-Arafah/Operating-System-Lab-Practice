package producerconsumer_20200104042_assignment3;


public class ProducerConsumer_20200104042_Assignment3 {


    public static void main(String[] args) {
        // TODO code application logic here
        Shared buffer = new Shared();
        Producer producer1 = new Producer(buffer, "Producer 1");
        Consumer consumer1 = new Consumer(buffer, "Consumer 1");
        Producer producer2 = new Producer(buffer, "Producer 2");     
        Consumer consumer2 = new Consumer(buffer, "Consumer 2");
        
        producer1.start();
        producer2.start();
        consumer1.start();
        consumer2.start();
    }
    
}
