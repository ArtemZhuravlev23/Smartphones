class Androids implements Smartphones, LinuxOS {

    @Override
    public void incomingCall() {
        System.out.println("\n" + "Information about Android:" + "\n");
        System.out.println("Android phone can accept a call from any user.");
    }

    @Override
    public void outgoingCall() {
        System.out.println("Android phone to make a call to internet-provider 'Fregat' by +380987344444.");
    }

    @Override
    public void incomingSms() {
        System.out.println("Android phone can accept a sms from any user.");
    }

    @Override
    public void outgoingSms() {
        System.out.println("Android phone send a text message to content number 'Lotto fun' by 330.");
    }

    @Override
    public void internet() {
        System.out.println("Android phone use the internet and open page in browser 'Rozetka'.");
    }

    @Override
    public void operationSystem() {
        System.out.println("Android is based on operation system LinuxOS.");
    }

    @Override
    public void programmingLanguage() {
        System.out.println("Android was created in a programming language Kotlin/Java." + "\n");
    }
}