package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.event.KeyEvent;

public class Controller {
    @FXML
    TextArea messageArea;

    @FXML
    TextField newMessage;

    @FXML
    Button sendButton;

    @FXML
    Button clearButton;

    public void sendMessageTypeAction(ActionEvent actionEvent) {
        String messageText = newMessage.getText().trim();
        if (!messageText.isEmpty()) {
            messageArea.appendText(messageText + System.lineSeparator());
            newMessage.clear();
        }
    }

    public void clearAreaAction (ActionEvent actionEvent) {
        messageArea.clear();
    }
}

