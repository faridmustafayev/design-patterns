package structural.proxy.allowedInternetProxy;

public class ProxyInternet implements Internet {
    private RealInternet realInternet;
    private final String[] allowedSites = {"proxyPattern.com", "example.org"};

    public ProxyInternet() {
        realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        boolean isAllow = false;

        for (String sites :
                allowedSites) {
            if (serverHost.contains(sites)) {
                isAllow = true;
                break;
            }
        }

        if (isAllow) {
            realInternet.connectTo(serverHost);
        }else {
            throw new Exception("Access to: " + serverHost + " is blocked");
        }

    }
}
