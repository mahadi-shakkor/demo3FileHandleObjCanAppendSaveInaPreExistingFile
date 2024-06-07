package com.oop.mahadi.demo3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class LoadObjects {
    public static List<Serializable> loadObjectsFromFile(String filePath) {
        List<Serializable> objects = new ArrayList<>();
        try (FileInputStream fileIn = new FileInputStream(filePath);
             ObjectInputStream in = new ObjectInputStream(fileIn)) {
            while (true) {
                try {
                    objects.add((Serializable) in.readObject());
                } catch (EOFException eof) {
                    break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return objects;
}
}