import java.lang.Thread.State;

class messagesender extends Thread{
    public messagesender(String name){
        super(name);//setter
    }
    @Override
    public void run() {
        try{
            for(int i=0;i<=3;i++){
                System.out.println("Message sending: "+getName());
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread was interrupted"+e);
        }
        System.out.println("Message  sent susccesfully");
    }
}
public class MessageApp {
    public static void main(String[] args) {
        messagesender m1 = new messagesender("Susmitha");
        messagesender m2 = new messagesender("Yakshi");
        //set priorities
        m1.setPriority(Thread.MAX_PRIORITY);
        m2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Message sender Started: "+m1.getState());
        System.out.println("Message sender Started: "+m2.getState());
         m1.start();
         m2.start();
         System.out.println("Message sent: "+m1.isAlive());
         System.out.println("Message sent: "+m2.isAlive());
       //main thread waits
       try {
    m1.join();
    m2.join();
} catch (InterruptedException e) {
    Thread.currentThread().interrupt();
    System.out.println("Main thread interrupted");
}
         System.out.println("Message sender Completed: "+m1.getState());
         System.out.println("Message sender Completed: "+m2.getState());
    }
    
}