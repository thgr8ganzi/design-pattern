package org.example.designpattern._03_behavioral.template_method._01_before;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MultuplyFileProcessor {

    private String path;
    public MultuplyFileProcessor(String path) {
        this.path = path;
    }

    public int process() {
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            int result = 0;
            String line = null;
            while ((line = br.readLine()) != null) {
                result *= Integer.parseInt(line);
            }
            return result;
        } catch (IOException e) {
            throw new IllegalArgumentException(path + " not found", e);
        }
    }
}
