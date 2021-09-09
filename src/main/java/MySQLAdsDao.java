import java.sql.*;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

    public MySQLAdsDao(Config config) throws SQLException {
        DriverManager.registerDriver(new Driver());
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                "root",
                "codeup"
        );
    }

    @Override
    public List<Ad> all() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM adlister_db");
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        Statement statement = connection.createStatement();
        return null;
    }
}
