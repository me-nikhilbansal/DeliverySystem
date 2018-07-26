package delivery_system;
import static delivery_system.myvariables.password;
import static delivery_system.myvariables.path;
import static delivery_system.myvariables.place;
import static delivery_system.myvariables.username;
import java.sql.*;
import javax.swing.JOptionPane;

public class deliverymain implements myvariables{
    public static void main(String[] args) {
         Connection myconnection;
          try
        {
        myconnection=DriverManager.getConnection(path+place, username, password);
        try
        {
            String query="select * from adminlogin";
            PreparedStatement mystatement=myconnection.prepareStatement(query);
            ResultSet myresult=mystatement.executeQuery();
            if(myresult.next())
            {
                login lg=new login();
                lg.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Runing Software for first time, Create ADMIN first!");
                adminlogin alg=new adminlogin();
                alg.setVisible(true);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Login Error."+e.getMessage());
        }
        finally
        {
            myconnection.close();
        }
    }
           catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection Error."+e.getMessage());
        }
    
}
}