package creational.singleton.withEnum;

public enum Connection {
    INSTANCE;

    private String query = "Bring me those whose name is Farid in the second column : ";

    public void addQuery(String query) {
        this.query += query;
    }

    public void showQueries() {
        System.out.println(query);
    }

}
