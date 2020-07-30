package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.awt.*;

public class Controller {
    @FXML private TextField tbX;
    @FXML private TextField tbA;
    @FXML private TextField tbB;
    @FXML private TextField tbResult;

    @FXML
    public void bClearClick(ActionEvent actionEvent) {
        tbX.setText("");
        tbA.setText("");
        tbB.setText("");
        tbResult.setText("");
    }

    @FXML
    public void bCalcClick(ActionEvent actionEvent) {
        String sx= tbX.getText();
        String sa= tbA.getText();
        String sb= tbB.getText();
        Double x,a,b;
        try {
            x=Double.valueOf(sx);
            a=Double.valueOf(sa);
            b=Double.valueOf(sb);
            if(x<=7 && a==0 && b==0)
                JOptionPane.showMessageDialog(null, "При x<=7 a и b не могут быть равны нулю");
            else{
                Double y;
                if(x<=7)
                    y=(x+4)/(a*a+b*b);
                else y=x*Math.pow(a+b,2);
                tbResult.setText(y.toString());
            }
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Вы ввели недопустимое числовое значение");
        }

    }

    @FXML
    public void bExitClick(ActionEvent actionEvent) {
        System.exit(0);
    }
}
