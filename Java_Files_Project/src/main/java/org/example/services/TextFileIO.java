package org.example.services;

import javax.lang.model.element.Element;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TextFileIO implements FileOnInterface {
    @Override
    public <T> void exportData(String fileName, List<T> list) throws IOException {
        File file = new File(fileName);
        FileOutputStream stream = null;

        try{
            stream = new FileOutputStream(file);
            for(T element: list){
                byte[] byteArray = (element.toString() + System.lineSeparator()).getBytes();
                stream.write(byteArray);
            }

        }catch(IOException e){
            System.out.println(e.getCause());
        }finally {
            if(stream!= null){
                stream.close();
            }
        }
    }

    @Override
    public  List<String> importData(String fileName) throws IOException {
        File file = new File(fileName);
        FileInputStream stream = null;
        List<String> list = new ArrayList<>();

        try{
            stream = new FileInputStream(file);
            Scanner scanner = new Scanner(stream);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                list.add(line);
            }

        }catch(IOException exception){
            System.out.println(exception.getCause());
        }finally {
            if(stream!=null){
                stream.close();
            }
        }



        return list;
    }
}
