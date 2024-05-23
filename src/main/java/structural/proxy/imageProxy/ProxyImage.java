package structural.proxy.imageProxy;

public class ProxyImage implements Image{
    private String fileName;
    private RealImage realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        load();
    }

    @Override
    public void display() {
        if (realImage == null)
            realImage = new RealImage(fileName);
        realImage.display();
    }

    public void load() {
        System.out.println("loading a file: " + fileName);
    }

}
