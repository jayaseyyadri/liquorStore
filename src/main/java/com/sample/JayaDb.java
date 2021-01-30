package com.sample;

import java.sql.*;

import com.mysql.cj.jdbc.Driver;
import com.sample.dao.Config;

public class JayaDb {


    public static void main(String[] args) {
        Config config  = new Config();
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(config.getUrl(), config.getUser(), config.getPassword());
            PreparedStatement statement = connection.prepareStatement("select * from practice_db.liquorStore");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                System.out.println("Id -> " +resultSet.getInt("id"));
                System.out.println("Name -> " + resultSet.getString("name"));
                System.out.println("Price -> " +resultSet.getFloat("price"));
                System.out.println("quantity -> " +resultSet.getInt("quantity"));
                System.out.println();
            }
        }
        catch (Exception e) {
            System.out.println("Exception "+ e);
        }


    }
}
