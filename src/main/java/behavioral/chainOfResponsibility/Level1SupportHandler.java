package behavioral.chainOfResponsibility;

public class Level1SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.BASIC) {
            System.out.println("Level 1 support handled the request ");
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextSupport(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}
