package structural.proxy.allowedInternetProxy;

public class Main {
    public static void main(String[] args) {

        Internet proxyPattern = new ProxyInternet();

        try {
            proxyPattern.connectTo("fun.com");
            proxyPattern.connectTo("proxyPattern.com");
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }

    }
}
