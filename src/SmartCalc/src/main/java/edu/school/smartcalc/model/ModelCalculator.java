package edu.school.smartcalc.model;

import java.io.*;

public class ModelCalculator {
    static {
        try (InputStream inputStream = ModelCalculator.class.getResourceAsStream("/lib/libCalc.so")){
            File tempFile = File.createTempFile("libCalc", ".so");
            try (FileOutputStream fileOutputStream = new FileOutputStream(tempFile)) {
                int burWrite;
                byte[] buffer = new byte[1024];
                while ((burWrite = inputStream.read(buffer)) != -1) {
                        fileOutputStream.write(buffer, 0, burWrite);
                }
                System.load(tempFile.getAbsolutePath());
                tempFile.deleteOnExit();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public native int validator(String str, double num);
    public native double calcExpr(String str, double num);
}
