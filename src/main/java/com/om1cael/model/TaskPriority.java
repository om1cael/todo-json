package com.om1cael.model;

public enum TaskPriority {
    LOW (0),
    MEDIUM (1),
    HIGH (2),
    VERY_HIGH (3);

    private int id;

    TaskPriority(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}
