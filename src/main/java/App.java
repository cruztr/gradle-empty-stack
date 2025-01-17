/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        Mobile iPhone = new IPhone();
        Mobile android = new Android();

        iPhone.setName("iPhoneName");
        iPhone.setBrand("Apple");
        iPhone.setColor("Jet Black");
        android.setName("androidName");
        android.setBrand("Samsung");
        android.setColor("Black");


        Person iPhoneOwner = new Person();
        iPhoneOwner.setMobile(iPhone);

        Mobile iPhoneOwnerMobile = iPhoneOwner.getMobile();
        iPhoneOwnerMobile.call("short message");
        iPhoneOwnerMobile.call("This is above the max length for iPhone");
        iPhoneOwnerMobile.getInformation();

        System.out.println("----------------------------------------");

        Person androidOwner = new Person();
        androidOwner.setMobile(android);

        Mobile androidOwnerMobile = androidOwner.getMobile();
        androidOwnerMobile.call("short message");
        androidOwnerMobile.call("This is above the max length for iPhone");
        androidOwnerMobile.getInformation();

        System.out.println("----------------------------------------");

        iPhoneOwner.setMobile(android);
        Mobile formerIPhoneOwnerMobile = iPhoneOwner.getMobile();
        formerIPhoneOwnerMobile.call("short message");
        formerIPhoneOwnerMobile.call("This is above the max length for iPhone");
        formerIPhoneOwnerMobile.getInformation();

        System.out.println("----------------------------------------");

        IPhoneRobot iPhoneRobot = new IPhoneRobot();
        iPhoneRobot.setMobile(android);
        iPhoneRobot.setMobile(iPhone);
    }
}
