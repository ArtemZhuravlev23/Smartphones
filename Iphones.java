public class Iphones implements Smartphones, IOS {

    @Override
    public void incomingCall() {
        System.out.println("Information about iPhones:" + "\n");
        System.out.println("iPhone can accept a call from any user.");
    }

    @Override
    public void outgoingCall() {
        System.out.println("iPhone to make a call to internet-shop 'Allo' by 0-800-300-100.");
    }

    @Override
    public void incomingSms() {
        System.out.println("iPhone can accept a sms from any user.");
    }

    @Override
    public void outgoingSms() {
        System.out.println("iPhone send a text message to content number 'Eurovision' by 7576.");
    }

    @Override
    public void internet() {
        System.out.println("iPhone use the internet and open page in browser 'Allo'.");
    }

    @Override
    public void operationSystem() {
        System.out.println("iPhone is based on operation system iOS.");
    }

    @Override
    public void programmingLanguage() {
        System.out.println("iOS was created in a programming language Swift.");
    }
}