package behavioral.chainOfResponsibility;

public interface SupportHandler {
    void handleRequest(Request request);
    void setNextSupport(SupportHandler supportHandler);
}
