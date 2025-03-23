package com.om1cael.model;

public record Task(int id,
                   String taskDescription,
                   TaskPriority priority) {}
