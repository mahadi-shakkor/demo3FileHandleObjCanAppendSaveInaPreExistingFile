package com.oop.mahadi.demo3;

import javafx.fxml.Initializable;

import java.io.Serializable;

public class Cc implements Serializable {




    String s;
    @Override
    public String toString() {
        return "Cc{" +
                "s='" + s + '\'' +
                '}';
    }

    public Cc(String s) {
        this.s = s;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }
}
