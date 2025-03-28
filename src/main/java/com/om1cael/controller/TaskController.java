package com.om1cael.controller;

import com.om1cael.model.Task;
import com.om1cael.service.StorageService;

public class TaskController {
    private final StorageService storageService;

    public TaskController(StorageService storageService) {
        this.storageService = storageService;
    }

    public boolean addTask(Task task) {
        return this.storageService.save(task);
    }
}
