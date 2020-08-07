// Using MVC: Model - View - Controller
// Model: Main.java | Contains logic of the UI
// View: main-view.fxml | How the app will look like
// Controller: Controller.java
// Controller - bridge between the model and view. Decides where to go next.
//        View - displays the data, gathers user input
//        Model - business logic, interface to data store.

package code;

import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Control;
import javafx.scene.control.TableView;
import javafx.stage.Stage;


public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main-view.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 800, 400));
        primaryStage.show();
    }




    public static void main(String[] args) {
        launch(args);

    }
}
