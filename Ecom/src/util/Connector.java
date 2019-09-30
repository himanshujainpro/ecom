package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
    static Connection con=null;
    public static Connection doConnect()
    {
        String url,user_id,pass;
        url="jdbc:mysql://localhost:3306/ecom";
        user_id="root";
        pass="password";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con= DriverManager.getConnection(url,user_id,pass);
        }

        catch (ClassNotFoundException c)
        {
            c.printStackTrace();
        }

        catch (SQLException s)
        {
            s.printStackTrace();
        }
        return con;
    }

    static void doClose() throws SQLException {
        if(con!=null){
            con.close();
        }
    }

}
