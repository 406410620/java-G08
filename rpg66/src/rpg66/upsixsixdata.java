package rpg66;
import java.sql.*; 
public class upsixsixdata {
	String name;
    int place;
    int money;
    int role;

    public upsixsixdata(){
    }

    public void name_update(String name) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sixsix", "root", "0000");
            Statement statement = object.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM sixsix.player";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                rs.absolute(1);
                rs.updateString("name",name);
                rs.updateRow();
            }
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void money_update(int money) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sixsix", "root", "0000");
            Statement statement = object.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM sixsix.player";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                rs.absolute(1);
                rs.updateInt("money",money);
                rs.updateRow();
            }
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void place_update(int place) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sixsix", "root", "0000");
            Statement statement = object.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM sixsix.player";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                rs.absolute(1);
                rs.updateInt("place",place);
                rs.updateRow();
            }
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void role_update(int role) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        try {
            Connection object = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sixsix", "root", "0000");
            Statement statement = object.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            String sql = "SELECT * FROM "
            		+ ".player";
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()){
                rs.absolute(1);
                rs.updateInt("role",role);
                rs.updateRow();
            }
            object.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
