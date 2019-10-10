public class IPhone extends Mobile{
    private final int MAX_MESSAGE_LENGTH = 30;

    @Override
    public void call(String message){
        if(message.length() < MAX_MESSAGE_LENGTH)
            System.out.println("<iPhone>Message: " + message);
        else
            System.out.println("<iPhone>Message cannot be sent");
    }

}