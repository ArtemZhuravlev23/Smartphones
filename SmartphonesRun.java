public class SmartphonesRun {

    public static void main(String[] args) {

        Androids android = new Androids();
        android.incomingCall();
        android.outgoingCall();
        android.incomingSms();
        android.outgoingSms();
        android.internet();
        android.operationSystem();
        android.programmingLanguage();

        Iphones iPhone = new Iphones();
        iPhone.incomingCall();
        iPhone.outgoingCall();
        iPhone.incomingSms();
        iPhone.outgoingSms();
        iPhone.internet();
        iPhone.operationSystem();
        iPhone.programmingLanguage();

    }
}
