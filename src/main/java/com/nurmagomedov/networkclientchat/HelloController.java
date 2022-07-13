package com.nurmagomedov.networkclientchat;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Date;

public class HelloController {

    @FXML
    private TextArea chatArea;

    @FXML
    private ListView<String> clientHistory;

    @FXML
    private ListView<String> chatHistoryList;

    @FXML
    private TextField inputField;

    @FXML
    void initialize() {

    }

    @FXML
    void doSend(ActionEvent event) {
        String input = inputField.getText();
        try {
            if(input.length() == 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        chatArea.setText(input);
        chatHistoryList.getItems().add(0,String.format("Massege: %s -- was sent by --> %s",input,new Date()));

    }

}
