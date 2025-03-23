package com.om1cael.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class StorageService {
    private final Path storageFile = Path.of("storage.json");

    public void create() {
        if(storageExists()) return;

        try {
            Files.createFile(storageFile);
        } catch (IOException e) {
            System.err.println("Could not create the storage file.");
            System.err.println(e.getMessage());
        }
    }

    private boolean storageExists() {
        return Files.exists(storageFile);
    }
}
