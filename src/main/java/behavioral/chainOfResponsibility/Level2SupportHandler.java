package behavioral.chainOfResponsibility;

public class Level2SupportHandler implements SupportHandler{
    private SupportHandler supportHandler;

    @Override
    public void handleRequest(Request request) {
        if (request.getPriority() == Priority.INTERMEDIATE) {
            System.out.println("Level 2 support handled the request ");
        } else if (supportHandler != null) {
            supportHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextSupport(SupportHandler supportHandler) {
        this.supportHandler = supportHandler;
    }
}
