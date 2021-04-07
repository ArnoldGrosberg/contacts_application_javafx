package sample;// required package
// required imports
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
// public class Main and it extends Application
public class Main extends Application {
        // Override to load and get resources
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("Contacts");
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }

        // launches the app
    public static void main(String[] args) {
        launch(args);
    }
}
