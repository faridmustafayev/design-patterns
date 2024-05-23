package structural.proxy.bannedInternetProxy;

public class Main {
    public static void main(String[] args) {

        Internet proxyInternet = new ProxyInternet();

        try {
            proxyInternet.connectTo("proxyPattern.com");
            proxyInternet.connectTo("restricted.com");
        }catch (Exception exception) {
            System.out.println(exception.getMessage());
        }


    }
}
