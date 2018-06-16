package rpg66;
import java.sql.*;

public class getsixsixdata {
	String name;
    int place;
    int money;
    int role;

    public getsixsixdata() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try{
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sixsix","root","0000");
            Statement statement = object.createStatement();
            String sql = "SELECT * FROM sixsix.player";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                name = rs.getString("name");
                place = rs.getInt("place");
                money = rs.getInt("money");
                role = rs.getInt("role");
            }
            object.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public String getname(){
        return name;
    }
    public int getplace(){ 
    	return place; 
    	}
    public int getrole(){ 
    	return role; 
    	}
    public int getmoney(){
        return money;
    }
    


}
