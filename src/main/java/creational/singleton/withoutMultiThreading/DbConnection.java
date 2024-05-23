package creational.singleton.withoutMultiThreading;

public class DbConnection {
    private static DbConnection instance;

    private String query = "send query to database";

    private DbConnection() {

    }

    public static DbConnection getInstance() {
        if (instance == null) {
            instance = new DbConnection();
        }
        return instance;
    }

    public void addQuery(String query) {
        this.query += query;
    }

    public void showQueries() {
        System.out.println(query);
    }

}
