package com.example.demo.controller;

import de.felixroske.jfxsupport.FXMLController;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Create by leinuo on 19-8-30 下午3:41
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
@FXMLController
public class BaseController implements Initializable {
    public ResourceBundle resourceBundle;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        resourceBundle = resources;
    }
}
