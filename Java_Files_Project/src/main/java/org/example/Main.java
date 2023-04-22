package org.example;

import org.example.models.DataClass;
import org.example.services.ExTextFileIO;
import org.example.services.TextFileIO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        DataClass class1 = new DataClass(1,"value1","value1");
        DataClass class2 = new DataClass(2,"value2","value2");
        DataClass class3 = new DataClass(3,"value3","value3");
        //System.out.println(class1.toString());

        List<DataClass> list = new ArrayList<DataClass>();
        TextFileIO textFileIO = new TextFileIO();

        list.add(class1);
        list.add(class2);
        list.add(class3);

        String plik = "File.txt";

        try {
            textFileIO.exportData(plik, list);
        }catch(IOException exception){
            System.out.println(exception);
        }

        List<String> lista = new ArrayList<>();

        try{
            lista = textFileIO.importData(plik);
        }catch (IOException exception){
            System.out.println(exception);
        }

        for(String element: lista){
            System.out.println(element);
        }

        //    ExTextFileIO

        System.out.println("ExLista");

        ExTextFileIO exTextFileIO = new ExTextFileIO();
        List<DataClass> exList= new ArrayList<>(Arrays.asList(new DataClass(1,"value1","value2"),
                new DataClass(2,"value1","value2"),
                new DataClass(4,"value1","value2"),
                new DataClass(3,"value1","value2")));
        String exPlik = "exFile.txt";

        try{
            exTextFileIO.exportData(exPlik,exList);
        }catch(IOException exception){
            System.out.println(exception);
        }

        List<String> exLista = new ArrayList<>();

        try{
            exLista = exTextFileIO.importData(exPlik);
        }catch (IOException exception){
            System.out.println(exception);
        }

        for(String element: exLista){
            System.out.println(element);
        }


    }
}