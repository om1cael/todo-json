package com.om1cael.service;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.om1cael.model.Task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class StorageService {
    private final Path storageFile = Path.of("storage.json");
    private List<Task> tasks = new ArrayList<>();

    private final Gson gson;

    public StorageService(Gson gson) {
        this.gson = gson;
    }

    public void createIfNotExists() {
        if(storageExists()) return;

        try {
            Files.createFile(storageFile);
        } catch (IOException e) {
            System.err.println("Could not create the storage file.");
            System.err.println(e.getMessage());
        }
    }

    public boolean save(Task task) {
        loadCurrentContent();
        this.tasks.add(task);

        String jsonTasks = gson.toJson(this.tasks);

        try(BufferedWriter bufferedWriter = Files.newBufferedWriter(storageFile)) {
            bufferedWriter.write(jsonTasks);
            bufferedWriter.flush();
            return true;
        } catch (IOException e) {
            System.err.println("Could not save the task.");
            System.err.println(e.getMessage());
        }

        return false;
    }

    private void loadCurrentContent() {
        try(BufferedReader bufferedReader = Files.newBufferedReader(storageFile)) {
            TypeToken<List<Task>> taskListType = new TypeToken<>(){};
            String line;

            while((line = bufferedReader.readLine()) != null) {
                this.tasks = gson.fromJson(line, taskListType);
            }
        } catch (IOException e) {
            System.err.println("Could not load the tasks.");
            System.err.println(e.getMessage());
        }
    }

    private boolean storageExists() {
        return Files.exists(storageFile);
    }
}
