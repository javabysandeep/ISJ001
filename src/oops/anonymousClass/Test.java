package oops.anonymousClass;

public class Test {
    public static void main(String[] args) {
        MessageService messageService = new MessageServiceImpl();
        messageService.sendMessage();


        //anonymous class = class definition + object creation
        //className  ref = object
        MessageService ref = new MessageService(){
            @Override
            public void sendMessage() {
                System.out.println("sending message with anonymous class");
            }
        };
        ref.sendMessage();
    }
}
