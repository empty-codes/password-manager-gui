package javafx;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class MainSceneController {

 private Stage stage;
 private Scene scene;
 private Parent root;

 
 /* The reason that you need to do something about the IOException is that it is a checked exception. 
If you call a method that can throw an exception,you're required to either catch it (using try catch), or
declare that you're going to rethrow it (i.e tell the compiler that you know about the exception, 
but you don't plan to do anything about it) 
so that if your file is not found then the program doesnt blow up and gives you an error message. */


 public void switchToLoginScene(ActionEvent event) throws IOException {
  root = FXMLLoader.load(getClass().getResource("LoginScene.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow(); //get source of event and cast it to a node
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
 public void switchToCreateAccountScene(ActionEvent event) throws IOException {
  Parent root = FXMLLoader.load(getClass().getResource("CreateAccountScene.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }

 public void switchToPasswordResetScene1(ActionEvent event) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource("PasswordResetScene1.fxml"));
    stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    scene = new Scene(root);
    stage.setScene(scene);
    stage.show();
   }

public void switchToSecQuestionsScene(ActionEvent event) throws IOException {
   Parent root = FXMLLoader.load(getClass().getResource("SecQuestionsScene.fxml"));
   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
   scene = new Scene(root);
   stage.setScene(scene);
   stage.show();
  }

@FXML
//function for mimimize icon
private void minimizeWindow(MouseEvent event) {
   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
   stage.setIconified(true); //iconifies it to the taskbar; turns it into an icon from a window
}

@FXML
//function for maximize icon
private void maximizeWindow(MouseEvent event) {
   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
   //checks if stage is maximized, maximizes it if it isn't and sets it to the default stage size if it is (restore down)
   if(stage.isMaximized()) {
      stage.setMaximized(false);
   }else {
      stage.setMaximized(true);
   }
}

@FXML
//function for cancel icon
private void closeWindow(MouseEvent event) {
   stage = (Stage)((Node)event.getSource()).getScene().getWindow();
   javafx.application.Platform.exit(); /*JavaFX launcher will call the Application stop method and terminate the JavaFX application thread.
    The launcher thread will then shutdown. */
}
     

}
