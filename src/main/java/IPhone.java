public class IPhone extends Mobile{

    @Override
    public void call(String message){
        System.out.print("<iPhone>Message: " + message);
    }

}