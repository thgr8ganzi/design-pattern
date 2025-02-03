package org.example.designpattern._03_behavioral.template_method._02_after;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileProcessor {
    String path;
    public FileProcessor(String path) {
        this.path = path;
    }

    public int process(Operator operator) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            int result = 0;
            String line = null;
            while ((line = br.readLine()) != null) {
                result = operator.getResult(result, Integer.parseInt(line));
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + " not found", e);
        }
    }

//    protected abstract int getResult(int result, int number);
}
