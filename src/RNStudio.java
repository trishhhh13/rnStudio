import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class RNStudio extends Application {
  public static void main(String args[]) {
    Application.launch(args);
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    Button testButton = new Button("Test");
    Scene scene = new Scene(testButton, 500, 600);
    primaryStage.setTitle("RNStudio");
    primaryStage.setScene(scene);
    primaryStage.show();
  }
}
