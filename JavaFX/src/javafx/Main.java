package javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


//allows us get core functionality of javafx from the class application
public class Main extends Application{  
    @Override  //application calls a method called start that's overriden cause its inherited from application class
    public void start(Stage stage) throws Exception {  


        Parent root = FXMLLoader.load(getClass().getResource("LoginScene.fxml")); //attachs fxml file of scene you initially want to display
        Scene scene = new Scene(root); //Scene class, first parameter is your layout (other 2 are size of your scene if included)
        stage.setScene(scene);
        stage.initStyle(StageStyle.UNDECORATED); // removes the default minimize, maximize and close buttons
        stage.show(); // used to actually display the scene (i guess it's similar to System.out.println?)
    }  
    public static void main(String[] args) {  

        launch(args);  //sets up program as a JavaFX app
          
    }  
    }  