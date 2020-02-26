package com.example.demo.controller;

import com.example.demo.DemoApplication;
import com.example.demo.view.ToolView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.Event;
import javafx.stage.Modality;

import java.io.IOException;

/**
 * Create by leinuo on 19-8-30 下午3:04
 * <p>
 * qq:1321404703 https://github.com/leinuo2016
 */
@FXMLController
public class MainStageController{

    public void restart(final Event e) throws IOException {
       // DemoApplication.showView(ToolView.class, Modality.NONE);

        DemoApplication demoApplication = new DemoApplication();
        demoApplication.relaunch();
    }

    public void showView(final Event e) throws IOException {
         DemoApplication.showView(ToolView.class, Modality.NONE);
    }
}
