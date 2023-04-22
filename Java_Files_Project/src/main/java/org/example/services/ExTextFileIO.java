package org.example.services;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ExTextFileIO implements FileOnInterface{
    @Override
    public <T> void exportData(String fileName, List<T> list) throws IOException {
        PrintWriter writer = new PrintWriter(fileName);
        list.forEach(element -> writer.println(element.toString()));
        writer.close();
    }

    @Override
    public List<String> importData(String fileName) throws IOException {

        List<String> list = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            FileReader fileReader = new FileReader(fileName);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                list.add(line);
            }
        }catch(IOException exception){
            throw exception;
        }finally {
            if(bufferedReader != null){
                bufferedReader.close();
            }
        }

        return list;
    }
}
