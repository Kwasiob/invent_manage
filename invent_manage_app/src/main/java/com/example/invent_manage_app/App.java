package com.example.invent_manage_app;

import com.example.invent_manage_app.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

//Kwasi Obiri
//10906862

public class App extends Application {
    @Override
    public void start(Stage stage){
        Model.getInstance().getViewFactory().showLoginWindow();
    }
}
