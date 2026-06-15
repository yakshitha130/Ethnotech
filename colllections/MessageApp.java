class MessageSender extends Thread {

    public MessageSender(String name) {
        super(name);   // Sets the thread name
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(getName() + " sending message");
                Thread.sleep(1000);
            }
        } 
        catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Thread interrupted: " + e);
        }
    }
}

public class MessageApp {

    public static void main(String[] args) {

        MessageSender sender = new MessageSender("yakshi");
         MessageSender sender2 = new MessageSender("kavya");
          MessageSender sender3 = new MessageSender("Nanu");

        sender.start();
        sender2.start();
        sender3.start();
        

        }
}