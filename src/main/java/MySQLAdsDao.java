import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;

public class MySQLAdsDao implements Ads{

    private Connection connection = null;

    public MySQLAdsDao(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();

        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");

            while (rs.next()) {
                ads.add(new Ad (
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) throws SQLException {
        String query = String.format("inser into ads (user_id, title, description) values (%s, '%s', '%s')",
                ad.getUserId(), ad.getTitle(), ad.getDescription());

        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            return rs.getLong(1);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

}
