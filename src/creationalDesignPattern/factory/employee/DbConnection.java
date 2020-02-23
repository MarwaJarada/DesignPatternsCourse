package creationalDesignPattern.factory.employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConnection {

        private static DbConnection dbConnection;
        private Connection connection;
        private Statement statement;

        private DbConnection(){

        }


        public static DbConnection getConnection(){
            if (dbConnection==null)
                dbConnection=new DbConnection();
            return dbConnection;

        }

        public Statement getStatement() throws ClassNotFoundException, SQLException {
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.connection = DriverManager.
                        getConnection("jdbc:mysql://localhost:3306/employeedb",
                                "root", "");
                this.statement = this.connection.createStatement();
            }catch (Exception ex){
                ex.printStackTrace();
            }
            return this.statement;

        }

        public void closeConnection() throws SQLException {
            try {

                this.connection.close();
                this.statement.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }




}
