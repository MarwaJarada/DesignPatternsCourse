//package creationalDesignPattern.singleton;
//import javafx.scene.control.TextField;
//
//import java.io.IOException;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//import java.sql.Statement;
//
//public class DbConnection {
//    private static DbConnection dbConnection=null;
//    private Connection connection;
//    private Statement statement;
//
//
//    public static DbConnection getDbConnection() {
//        if (dbConnection==null){
//            dbConnection= new DbConnection();
//
//        }
//        return dbConnection;
//    }
//
//
//    public Statement getStatement(){
//
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            this.connection = DriverManager.
//                    getConnection("jdbc:mysql://localhost:3306/customerorder",
//                            "root", "");
//            this.statement = this.connection.createStatement();
//        }catch (Exception ex){
//            ex.printStackTrace();
//        }
//        return this.statement;
//
//    }
//
//
//    public void closeConnection() throws SQLException {
//        try {
//
//            this.connection.close();
//            this.statement.close();
//        }catch (SQLException ex){
//            ex.printStackTrace();
//        }
//    }
//
//
//    public static void main(String[] args) {
//        DbConnection dbConnection=DbConnection.getDbConnection();
//        Statement statement=dbConnection.getStatement();
//        String query="INSERT INTO CUSTOMER VALUES('" + 2598 + "','" + "d" + "','" + "d" + "','" + 526 + "','" + "dd@gmail.com" + "','" +
//                "dd" + "','" + "female" + "')";
//        try {
//            statement.execute(query);
//            dbConnection.closeConnection();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//
//    }
//
//
//
//
//
//
//}
