package behavioral.chainOfResponsibility;

public class Level3SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.CRITICAL) {
            System.out.println("Level 3 support handled the request ");
        }else {
            System.out.println("request can not be handled");
        }
    }

    @Override
    public void setNextSupport(SupportHandler nextHandler) {

    }
}
