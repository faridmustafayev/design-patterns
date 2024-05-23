package structural.proxy.imageProxy;

public class Main {
    public static void main(String[] args) {

        Image proxyImage = new ProxyImage("text_file.png");
        proxyImage.display();


        proxyImage.display();

    }
}
