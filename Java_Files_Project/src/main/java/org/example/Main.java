package org.example;

import org.example.models.DataClass;
import org.example.services.TextFileIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DataClass class1 = new DataClass(1,"value1","value1");
        DataClass class2 = new DataClass(2,"value2","value2");
        System.out.println(class1.toString());

        List<DataClass> list = new ArrayList<DataClass>();
        TextFileIO textFileIO = new TextFileIO();

        list.add(class1);
        list.add(class2);

        try {
            textFileIO.exportData("file.txt", list);
        }catch(IOException exception){
            System.out.println(exception.getMessage());
        }


    }
}