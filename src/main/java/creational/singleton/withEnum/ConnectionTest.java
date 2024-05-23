package creational.singleton.withEnum;

public class ConnectionTest {
    public static void main(String[] args) {

        Connection connection = Connection.INSTANCE;
        connection.addQuery("and check with third column");

        connection.showQueries();

    }
}
