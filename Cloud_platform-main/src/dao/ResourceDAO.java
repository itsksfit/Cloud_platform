package dao;

import model.Resource;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ResourceDAO {
    public void addResource(Resource r) throws Exception {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement(
                "INSERT INTO resources VALUES (?, ?, ?)"
        );
        ps.setInt(1, r.getResourceId());
        ps.setString(2, r.getType());
        ps.setString(3, r.getConfiguration());
        ps.executeUpdate();
    }
}
