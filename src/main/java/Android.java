public class Android extends Mobile{
    private final int MAX_MESSAGE_LENGTH = 40;

    @Override
    public void call(String message){
        if(message.length() < MAX_MESSAGE_LENGTH)
            System.out.println("<Android>Message: " + message);
        else
            System.out.println("<Android>Message cannot be sent");
    }

}
