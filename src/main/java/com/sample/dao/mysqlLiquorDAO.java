package com.sample.dao;
import java.sql.*;
import com.mysql.cj.jdbc.Driver;

public class mysqlLiquorDAO implements Iliquor{
    private Connection connection;

    public  mysqlLiquorDAO(Config config){
        try {
            DriverManager.registerDriver(new Driver());
            this.connection =DriverManager.getConnection(
                    config.getUrl(),
                    config.getPassword(),
                    config.getUser()
            );

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    @Override
    public void all() {

    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete(liquor liquor) {

    }

    @Override
    public void search(Long id) {

    }
}

