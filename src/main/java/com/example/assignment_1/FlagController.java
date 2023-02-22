package com.example.assignment_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class FlagController {
    @FXML
    private Rectangle TopLayer;
    @FXML
    private Rectangle MiddleLayer;
    @FXML
    private Rectangle BottomLayer;


    public void RussiaFlag(ActionEvent event) {
        TopLayer.setFill(Color.rgb(255, 255, 255));
        MiddleLayer.setFill(Color.rgb(28, 53, 120));
        BottomLayer.setFill(Color.rgb(228, 24, 28));
    }


    public void IndiaFlag(ActionEvent event) {
        TopLayer.setFill(Color.rgb(255, 153, 51));
        MiddleLayer.setFill(Color.rgb(255, 255, 255));
        BottomLayer.setFill(Color.rgb(19, 136, 8));
    }

    public void ArgentinaFlag(ActionEvent event) {
        TopLayer.setFill(Color.rgb(108, 172, 228));
        MiddleLayer.setFill(Color.rgb(255, 255, 255));
        BottomLayer.setFill(Color.rgb(108, 172, 228));
    }

    public void CroatiaFlag(ActionEvent event) {
        TopLayer.setFill(Color.rgb(255, 0, 0));
        MiddleLayer.setFill(Color.rgb(255, 255, 255));
        BottomLayer.setFill(Color.rgb(1, 33, 105));
    }

    public void ElSalvadorFlag(ActionEvent event) {
        TopLayer.setFill(Color.rgb(0, 71, 171));
        MiddleLayer.setFill(Color.rgb(255, 255, 255));
        BottomLayer.setFill(Color.rgb(0, 71, 171));
    }

    public void ClearButton(ActionEvent event) {
        TopLayer.setFill(null);
        MiddleLayer.setFill(null);
        BottomLayer.setFill(null);
    }
}