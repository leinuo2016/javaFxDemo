package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.view.LoginView;
import com.example.demo.view.ToolView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Modality;
import org.springframework.beans.factory.annotation.Autowired;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;


/**
 * Create by leinuo on 19-8-30 下午4:24
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */

@FXMLController
public class LoginController implements Initializable {

    @FXML
    private Button login;
    @FXML
    private TextField name;
    @FXML
    private TextField password;
    @FXML
    private Label info;
    @Autowired
    private UserService userService;

    private ResourceBundle resourceBundle;
    private User user = new User();


    public void login(final Event event){
        String nameStr =  name.getText();
        String pwdStr =  password.getText();
        System.out.println(nameStr+pwdStr+"--"+user.getPwd());
        User user = userService.findById(Long.valueOf(1));
        if(Objects.isNull(user)){
            info.setText("用户不存在!");
            info.disableProperty().setValue(false);
        }
        DemoApplication.showView(ToolView.class, Modality.NONE);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        resourceBundle = resources;
        name.textProperty().bindBidirectional(user.usernameProperty());
        password.textProperty().bindBidirectional(user.passwordProperty());

    }
}
