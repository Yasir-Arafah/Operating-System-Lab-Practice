package producerconsumer_20200104042_assignment3;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Consumer extends Thread{
    private Shared buffer;
    private String consumerName;
    
    public Consumer(Shared buffer,String consumerName){
    this.buffer = buffer;
    this.consumerName = consumerName;
    }
    
    @Override
    public void run() {
    
        try {
            for(int i =1;i<=5;i++)
            {
             buffer.consume(consumerName);
             sleep(200);
          
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
}
