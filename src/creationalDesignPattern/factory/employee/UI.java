package creationalDesignPattern.factory.employee;

/**
 * @author Marwa N. Jarada
 * @Date 20/2/2020
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.net.URL;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class UI extends Application implements Initializable  {
    @FXML private ListView resultLstView;
    @FXML private TextField searchTxtField;
    @FXML private ComboBox searchCombobox;
    DbConnection dbConnection;
    Statement statement;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            searchCombobox.setItems(FXCollections
                    .observableArrayList(Factory.showEmployeeAttribute().values()));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        FXMLLoader loader=new FXMLLoader(getClass().getResource("ui.fxml"));
        Parent parent=loader.load();
        Scene scene=new Scene(parent);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Employee Search");
        primaryStage.show();
        Factory.showEmployeeAttribute();
    }


    public void searchEmployee(javafx.event.ActionEvent event) throws SQLException, ClassNotFoundException {


        if (searchTxtField.getText().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Information");
            alert.setHeaderText("You must enter content to search  ..");
            alert.setContentText("Text field musn't be Empty..  ");
            alert.show();
        }if (searchCombobox.getSelectionModel().isEmpty()){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Invalid Information");
            alert.setHeaderText("You must choose search criteria to search  ..");
            alert.show();

        }else {

            String searchCriteria=searchCombobox.getSelectionModel().getSelectedItem().toString();
            String searchValue=searchTxtField.getText();

            this.searchEmployee(searchCriteria,searchValue);




        }


    }



    public void searchEmployee(String criteria,String content) throws SQLException, ClassNotFoundException {
        dbConnection = DbConnection.getConnection();
        statement = dbConnection.getStatement();
        String query = "SELECT* FROM emp WHERE 'criteria'='"+content+"'";
//        try {
//            ResultSet resultSet = statement.executeQuery(query);
//            resultSet.next();
//            String fname=resultSet.getString("fname");
//            String lname=resultSet.getString("lname");
//            resultLstView.setItems(FXCollections.observableArrayList(fname,lname));
//        }catch (SQLException ex){
//        }



    }




}
