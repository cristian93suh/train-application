package com.trainApplication.demo.repository;

import com.trainApplication.demo.model.User;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    private final String url = "jdbc:mysql://localhost:3306/train_db";
    private final String username = "cristian";
    private final String password = "cristian";

    // Recupera tutti gli utenti dal database
    public List<User> findAll() {
        List<User> users = new ArrayList<>();
        String query = "SELECT * FROM user";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            while (resultSet.next()) {
                User user = new User(
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getString("age"),
                        resultSet.getString("gender"),
                        resultSet.getString("mail")
                );
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return users;
    }

    // Salva un nuovo utente nel database
    public void save(User user) {
        String query = "INSERT INTO user (name, surname, age, gender, mail) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(url, username, password);
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getSurname());
            preparedStatement.setString(3, user.getAge());
            preparedStatement.setString(4, user.getGender());
            preparedStatement.setString(5, user.getMail());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
