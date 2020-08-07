package code;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TableView<Employee> emp_table;

    @FXML
    TableColumn<Employee, Integer> nameCol = new TableColumn<>("E-ID");

    @FXML
    TableColumn<Employee, Integer> eid;

    @FXML
    TableColumn<Employee, String> fname;

    @FXML
    TableColumn<Employee, String> lname;

    @FXML
    TableColumn<Employee, Integer> spm;

    @FXML
    TableColumn<Employee, String> prof;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String first_name;
        String last_name;
        int salary_per_month;
        String profession;
        int e_id;
        ObservableList<Employee> list = FXCollections.observableArrayList();


        eid.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("e_id"));
        fname.setCellValueFactory(new PropertyValueFactory<Employee, String>("first_name"));
        lname.setCellValueFactory(new PropertyValueFactory<Employee, String>("last_name"));
        spm.setCellValueFactory(new PropertyValueFactory<Employee, Integer>("salary_per_month"));
        prof.setCellValueFactory(new PropertyValueFactory<Employee, String>("profession"));


        emp_table.getColumns().addAll(eid, fname, lname, spm, prof);


        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sardab_db", "root", "");

            String ans = "SELECT * FROM sardab_employees";

            ResultSet rs = connection.createStatement().executeQuery(ans);


            while (rs.next()) {
                first_name = rs.getString("first_name");
                last_name = rs.getString("last_name");
                salary_per_month = rs.getInt("salary_per_month");
                profession = rs.getString("profession");
                e_id = rs.getInt("E_ID");
                Employee e = new Employee(e_id, first_name, last_name, salary_per_month, profession);
                list.add(e);
                emp_table.setItems(list);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
