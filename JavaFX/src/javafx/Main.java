package javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


//allows us get core functionality of javafx from the class application
public class Main extends Application{  
    @Override  //application calls a method called start that's overriden cause its inherited from application class
    public void start(Stage primaryStage) throws Exception {  


        Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml")); //attachs fxml file
        Scene scene = new Scene(root); //Scene class, first parameter is your layout (other 2 are size of your scene if included)

        primaryStage.setScene(scene);
        primaryStage.show(); // used to actually display the scene (i guess it's similar to System.out.println?)
    }  
    public static void main(String[] args) {  
        launch(args);  //sets up program as a JavaFX app
          
    }  
    }  