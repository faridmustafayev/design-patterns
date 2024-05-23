package structural.adapter.animal;

public class AdapterLion implements Animal {
    private Lion lion;

    public AdapterLion(Lion lion) {
        this.lion = lion;
    }

    @Override
    public void run() {
        lion.runLion();
    }
}
