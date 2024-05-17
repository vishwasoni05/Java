// Scenario 8: Mobile Application Development
// Design an abstract class called "App" with abstract methods like "open" and "close." Implement derived classes like "ChatApp" and "PhotoEditingApp" that provide specific implementations for these abstract methods.

abstract class App {
    String app_name;

    App(String app_name) {
        this.app_name = app_name;
    }

    void display() {
        System.out.println("\nApp Name:" + app_name);
    }

    abstract void open();

    abstract void close();

}

class ChatApp extends App {
    ChatApp(String app_name) {
        super(app_name);
    }

    @Override
    void open() {
        System.out.println(super.app_name+" is open!!");
    }

    @Override
    void close() {
        System.out.println(super.app_name+" is close!!");
    }
}
class PhotoEditingApp extends App {
    PhotoEditingApp(String app_name) {
        super(app_name);
    }
    @Override
    void open() {
        System.out.println(super.app_name+" is open!!");
    }

    @Override
    void close() {
        System.out.println(super.app_name+" is close!!");
    }
}
public class MobileApplicationDevelopment {
    public static void main(String[] args) {
        ChatApp c = new ChatApp("ChatApp");
        c.display();
        c.open();
        c.close();

        PhotoEditingApp p = new PhotoEditingApp("PhotoEditingApp");
        p.display();
        p.open();
        p.close();
    }
}
