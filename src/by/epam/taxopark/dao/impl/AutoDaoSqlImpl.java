package by.epam.taxopark.dao.impl;

import by.epam.taxopark.dao.AutoDao;
import by.epam.taxopark.entity.Auto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AutoDaoSqlImpl implements AutoDao {

    private static final String URL = "jdbc:mysql://localhost/Auto?serverTimezone=Europe/Moscow&useSSL=false";
    private static final String LOGIN = "root";
    private static final String PASSWORD = "";

    @Override
    public List <Auto> readAll() {
        List<Auto> autopark = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection conn = DriverManager.getConnection(URL, LOGIN, PASSWORD)) {

                Statement st = conn.createStatement();
                ResultSet rs = st.executeQuery("select * from Auto");
                Auto auto = null;
                while (rs.next()) {
                    auto = new Auto(rs.getInt("id"), rs.getString("mark"), rs.getDouble("engineCapacity"), rs.getString("color"));
                    autopark.add(auto);
                }

            } catch (SQLException e ) {

                e.printStackTrace();
            }
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return autopark;
    }
}
