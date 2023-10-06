package org.example.class3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileManager8 {
    private String directoryPath;

    public FileManager8(String directoryPath) {
        this.directoryPath = directoryPath;
    }

    public static void createDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs();
        }
    }

    public static void deleteDirectory(String directoryPath) {
        File directory = new File(directoryPath);
        if (directory.exists()) {
            try {
                Files.walk(Paths.get(directoryPath))
                        .map(Path::toFile)
                        .forEach(File::delete);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean createFile(String fileName) {
        try {
            File file = new File(directoryPath, fileName);
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(new File(directoryPath, fileName));
            writer.write(content);
            writer.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String readFromFile(String fileName) {
        try {
            Path filePath = Paths.get(directoryPath, fileName);
            return Files.readString(filePath);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public boolean deleteFile(String fileName) {
        try {
            File file = new File(directoryPath, fileName);
            return file.delete();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean fileExists(String fileName) {
        File file = new File(directoryPath, fileName);
        return file.exists();
    }
}
