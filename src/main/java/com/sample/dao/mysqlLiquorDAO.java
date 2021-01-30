package com.sample.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.jdbc.Driver;
import com.sample.model.LiquorBean;

public class mysqlLiquorDAO implements IliquorDao {
    private Connection connection;

    public mysqlLiquorDAO(Config config) {
        try {
            DriverManager.registerDriver(new Driver());
            this.connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getPassword(),
                    config.getUser()
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public List<LiquorBean> all() {
        List<LiquorBean> output = new ArrayList<>();
        String query = "SELECT * FROM practice_db.liquorStore";
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            LiquorBean newLiquorBean =new LiquorBean(
//                     id,
//                    name,
//                    price,
//                    quantity
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void insert() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete(LiquorBean liquorBean) {

    }

    @Override
    public void search(Long id) {

    }
}

