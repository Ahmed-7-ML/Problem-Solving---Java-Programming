/*
7. A notification system has a base class `Notification` with a
    `send(String message)` method.

Override it in `EmailNotification`, `SMSNotification`, and `PushNotification`.
Store all three in a `Notification[]` array and send a message to all of them in a loop.
*/

// Single (Multi-Level) Inheritance

// Base Class
class Notification{
    String recipient;
    Notification(String recipient){
        this.recipient = recipient;
    }
    void send(String message){
        System.out.println("Message: " + message + " To " + recipient);
    }
}

// Child Classes
class EmailNotification extends Notification{
    EmailNotification(String recipient){
        super(recipient);
    }

    @Override
    void send(String message){
        System.out.println("Email Message: " + message + " To " + recipient);
    }
}

class SMSNotification extends Notification{
    SMSNotification(String recipient){
        super(recipient);
    }

    @Override
    void send(String message){
        System.out.println("SMS Message: " + message + " To " + recipient);
    }
}

class PushNotification extends Notification{
    PushNotification(String recipient){
        super(recipient);
    }

    @Override
    void send(String message){
        System.out.println("Push Message: " + message + " To " + recipient);
    }
}

public class Main {
    public static void main(String[] args){
        Notification[] alerts = {new EmailNotification("ahmed@gmail.com"), new SMSNotification("100-795-2538"), new PushNotification("iPhone")};

        String message = "Hello, i hope you are doing well!";

        for(Notification a : alerts){
            a.send(message);
        }
    }
}