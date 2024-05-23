package behavioral.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {

        SupportHandler supportHandler1 = new Level1SupportHandler();
        SupportHandler supportHandler2 = new Level2SupportHandler();
        SupportHandler supportHandler3 = new Level3SupportHandler();

        supportHandler1.setNextSupport(supportHandler2);
        supportHandler2.setNextSupport(supportHandler3);

        Request request1 = new Request(Priority.BASIC);
        Request request2 = new Request(Priority.INTERMEDIATE);
        Request request3 = new Request(Priority.CRITICAL);

        supportHandler1.handleRequest(request1);
        supportHandler1.handleRequest(request2);
        supportHandler1.handleRequest(request3);


    }
}
