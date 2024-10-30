package org.example.designpattern._02_structural.bridge._03_java;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class BridgeInJava {
    private static Logger logger = Logger.getLogger(BridgeInJava.class.getName());

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("org.h2.Driver");
        logger.info("Driver loaded");

        try (Connection connection = java.sql.DriverManager.getConnection("jdbc:h2:mem:~/test", "sa", "")) {
            String sql = "CREATE TABLE TEST(ID INT PRIMARY KEY, NAME VARCHAR(255))";

            Statement statement = connection.createStatement();
            statement.execute(sql);

//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            ResultSet resultSet = preparedStatement.executeQuery();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
