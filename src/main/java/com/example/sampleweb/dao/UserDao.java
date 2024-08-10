package com.example.sampleweb.dao;

import com.example.sampleweb.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDao {
    private final String jdbcURL = "jdbc:mysql://your-rds-endpoint:3306/yourdbname";
    private final String jdbcUsername = "yourusername";
    private final String jdbcPassword = "yourpassword";

    public void saveUser(User user) throws SQLException {
        String INSERT_USERS_SQL = "INSERT INTO users (name, email, location, phone) VALUES (?, ?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getLocation());
            preparedStatement.setString(4, user.getPhone());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw new SQLException("Error saving user data", e);
        }
    }
}
