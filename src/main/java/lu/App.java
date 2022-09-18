package lu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            Class.forName("org.sqlite.JDBC");
            Connection co = DriverManager.getConnection("jdbc:sqlite:my.db");
            System.out.println("Ok");

//            String query = "CREATE TABLE users (name TEXT, surname TEXT);";
            String query = "INSERT INTO users (name, surname) VALUES('David','Kachetupian')";
            Statement statement = co.createStatement();
            statement.executeUpdate(query);
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
