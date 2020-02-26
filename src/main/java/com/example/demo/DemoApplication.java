package com.example.demo;

import com.example.demo.view.LoginView;
import com.example.demo.view.MainStageView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import de.felixroske.jfxsupport.SplashScreen;
import javafx.application.Platform;
import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication extends AbstractJavaFxApplicationSupport {

    public static void main(String[] args) {
        launch(DemoApplication.class,LoginView.class,new SplashScreen(),args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        super.start(stage);
    }

    public void relaunch(){
        Platform.runLater(() -> {
            getStage().close();
            try {
                this.stop();
                this.init();
                this.start(new Stage());
            } catch (Exception e) {
            }
        });
    }
}
