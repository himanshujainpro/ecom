package dao;

import java.sql.*;

public class CustomerDAO {
	
	public boolean verify(String email, String password) throws SQLException{
		String query="select * from ecom.customer where email=?";
		Connection con=util.Connector.doConnect();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, email);
		ResultSet rs=pst.executeQuery();
		boolean flag=false;
		
		if(rs.next()) if(rs.getString(1).equals(email) && rs.getString(5).equals(password)) flag=true;
		return flag;
	}
	
	public String getPassword(String email) throws SQLException {
		String password=null;
		String query="select * from ecom.customer where email=?";
		Connection con=util.Connector.doConnect();
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1, email);
		ResultSet rs=pst.executeQuery();
		
		if(rs.next()) password=rs.getString(5);
		return password;
	}
	
	public int registerCustomer(model.CustomerData tempCustomer) throws SQLException {
		
		String query="insert into ecom.customer values (?,?,?,?,?)";
		Connection con=util.Connector.doConnect();
        PreparedStatement pst=con.prepareStatement(query);
        pst.setString(1, tempCustomer.email);
        pst.setString(2, tempCustomer.firstName);
        pst.setString(3, tempCustomer.lastName);
        pst.setInt(4, tempCustomer.mobile);
        pst.setString(5, tempCustomer.password);
        int result=pst.executeUpdate();
        return result;
	}
}
