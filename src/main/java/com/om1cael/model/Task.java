package com.om1cael.model;

public class Task {
    private int id;
    private final String taskDescription;
    private final TaskPriority priority;

    // Constructor
    public Task(int id, String taskDescription, TaskPriority priority) {
        this.id = id;
        this.taskDescription = taskDescription;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public TaskPriority getPriority() {
        return priority;
    }

    public void setId(int id) {
        this.id = id;
    }
}
