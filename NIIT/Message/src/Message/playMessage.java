package Message;

public abstract class playMessage {
    String msg;


    public playMessage(String msg) {
        this.msg = msg;
    }
    public void displayMsg()
    {
        System.out.println("Hello.....This is Rohit ");
    }
    public void exitplayMessage()
    {

    }
    public abstract void playMessage();
}
