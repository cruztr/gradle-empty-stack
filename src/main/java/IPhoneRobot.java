public class IPhoneRobot {
    private Mobile mobile;

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        if(mobile instanceof Android)
            System.out.println("IPhone robot can only use iPhone!");
        else {
            this.mobile = mobile;
            System.out.println("Android mobile set for IPhoneRobot");
        }
    }
}
