package com.oop.mahadi.demo3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class SaveObjects {
    public static void saveObjectsToFile(List<Serializable> objects, String filePath) {
        try (FileOutputStream fileOut = new FileOutputStream(filePath);
             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
            for (Serializable obj : objects) {
                out.writeObject(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
}
}
}