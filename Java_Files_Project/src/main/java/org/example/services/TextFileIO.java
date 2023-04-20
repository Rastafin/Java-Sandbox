package org.example.services;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

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
            e.printStackTrace();
        }finally {
            if(stream!= null){
                stream.close();
            }
        }
    }

    @Override
    public <T> List<T> importData(String fileName) throws IOException {
        return null;
    }
}
