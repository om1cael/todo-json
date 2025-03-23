package com.om1cael.model;

public enum AppOptions {
    ADD_TASK ("Add Task"),
    LIST_TASKS ("List Tasks"),
    REMOVE_TASK ("Remove Task"),
    EXIT ("Exit");

    private final String description;

    AppOptions(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }
}
