interface Smartphones {

    public void incomingCall();

    public void incomingSms();

    public void outgoingCall();

    public void outgoingSms();

    public void internet();

}

interface LinuxOS {
    public void operationSystem();

    public void programmingLanguage();
}

interface iOS {
    public void operationSystem();

    public void programmingLanguage();
}

class Androids implements Smartphones, LinuxOS {

    public void incomingCall() {
        System.out.println("\n" + "Information about Android:" + "\n");
        System.out.println("Android phone can accept a call from any user.");
    }

    public void outgoingCall() {
        System.out.println("Android phone to make a call to internet-provider 'Fregat' by +380987344444.");
    }

    public void incomingSms() {
        System.out.println("Android phone can accept a sms from any user.");
    }

    public void outgoingSms() {
        System.out.println("Android phone send a text message to content number 'Lotto fun' by 330.");
    }

    public void internet() {
        System.out.println("Android phone use the internet and open page in browser 'Rozetka'.");
    }

    public void operationSystem() {
        System.out.println("Android is based on operation system LinuxOS.");
    }

    public void programmingLanguage() {
        System.out.println("Android was created in a programming language Kotlin/Java." + "\n");
    }
}

class iPhones implements Smartphones, iOS {

    public void incomingCall() {
        System.out.println("Information about iPhones:" + "\n");
        System.out.println("iPhone can accept a call from any user.");
    }

    public void outgoingCall() {
        System.out.println("iPhone to make a call to internet-shop 'Allo' by 0-800-300-100.");
    }

    public void incomingSms() {
        System.out.println("iPhone can accept a sms from any user.");
    }

    public void outgoingSms() {
        System.out.println("iPhone send a text message to content number 'Eurovision' by 7576.");
    }

    public void internet() {
        System.out.println("iPhone use the internet and open page in browser 'Allo'.");
    }

    public void operationSystem() {
        System.out.println("iPhone is based on operation system iOS.");
    }

    public void programmingLanguage() {
        System.out.println("iOS was created in a programming language Swift.");
    }

    public static void main(String[] args) {

        Androids android = new Androids();
        android.incomingCall();
        android.outgoingCall();
        android.incomingSms();
        android.outgoingSms();
        android.internet();
        android.operationSystem();
        android.programmingLanguage();

        iPhones iPhone = new iPhones();
        iPhone.incomingCall();
        iPhone.outgoingCall();
        iPhone.incomingSms();
        iPhone.outgoingSms();
        iPhone.internet();
        iPhone.operationSystem();
        iPhone.programmingLanguage();

    }
}

