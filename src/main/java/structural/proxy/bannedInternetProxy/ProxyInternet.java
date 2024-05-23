package structural.proxy.bannedInternetProxy;

public class ProxyInternet implements Internet {
    private RealInternet realInternet;
    private final String[] bannedSites = {"restricted.com", "blocked.com"};

    public ProxyInternet() {
        realInternet = new RealInternet();
    }

    @Override
    public void connectTo(String serverHost) throws Exception {
        for (String sites :
                bannedSites) {
            if (serverHost.contains(sites)) {
                throw new Exception("Access to: " + serverHost + " is restricted ..");
            }else {
                realInternet.connectTo(serverHost);
            }
        }
    }
}
