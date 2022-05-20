package com.apps;
import com.apps.db.DBSQLConnection;
import java.sql.*;
import org.zkoss.zul.*;


public class Customer extends Window {
	String SQL;
	public void saveItem(String cid, String cname, String caddress) throws Exception {
		SQL = "INSERT INTO CUSTOMER VALUES (?,?,?)";
		Connection conn = new DBSQLConnection().openConnection();
		PreparedStatement prep = conn.prepareStatement(SQL);
		prep.setString(1, cid);
		prep.setString(2, cname);
		prep.setString(3, caddress);
		prep.executeUpdate();
		conn.close();
	}

}
