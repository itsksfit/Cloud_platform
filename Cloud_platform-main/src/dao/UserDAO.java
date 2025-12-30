package dao;

import model.User;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class UserDAO {

    public void addUser(User user) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO users VALUES (?, ?, ?)"
        );
        ps.setInt(1, user.getId());
        ps.setString(2, user.getName());
        ps.setString(3, user.getRole());
        ps.executeUpdate();
    }
}
