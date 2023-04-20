package org.example.services;

import java.io.IOException;
import java.util.List;

public interface FileOnInterface {
    public <T> void exportData(String fileName, List<T> list) throws IOException;
    public <T> List<T> importData(String fileName) throws IOException;
}
