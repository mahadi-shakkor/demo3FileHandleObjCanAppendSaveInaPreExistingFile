package com.oop.mahadi.demo3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.List;

public class AppendObjects {

    public static void appendObjectsToFile(List<Serializable> newObjects, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath, true);
             AppendableObjectOutputStream out = new AppendableObjectOutputStream(fileOut)) {
            for (Serializable obj : newObjects) {
                out.writeObject(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
}
}
}
