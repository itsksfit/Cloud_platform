package dao;

import util.DBConnection;
import java.sql.Connection;

public class BillingDAO {
    public void processPayment() throws Exception {
        Connection con = DBConnection.getConnection();
        con.setAutoCommit(false);
        // billing logic
        con.commit();
    }
}
