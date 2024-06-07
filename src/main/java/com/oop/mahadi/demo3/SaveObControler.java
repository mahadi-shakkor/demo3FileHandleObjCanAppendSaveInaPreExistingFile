package com.oop.mahadi.demo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SaveObControler {    @javafx.fxml.FXML
public void initialize() {
}

    @FXML
    private TextField nameFxid;

    @FXML
    private TextArea textAreafxid;

    @FXML
    void createButtononaction (ActionEvent event) {
        textAreafxid.clear();

        File f=new File("C:\\oop\\demo3\\writeCcObject.txt");
        if (!nameFxid.getText().isEmpty()){
            if (!f.exists()){
                List<Serializable> l = new ArrayList<>();
                l.add(new Cc(nameFxid.getText()));
                String x ="writeCcObject.txt";
                SaveObjects.saveObjectsToFile(l,x);
            }
            else {
                List<Serializable> l = new ArrayList<>();
                l.add(new Cc(nameFxid.getText()));
                String x ="writeCcObject.txt";
                AppendObjects.appendObjectsToFile(l,x);



            }
        }
        else {

            textAreafxid.setText("enter a name");
        }

        String x ="writeCcObject.txt";
       List<Serializable> d = LoadObjects.loadObjectsFromFile(x);
      System.out.println(d);


    }

}
