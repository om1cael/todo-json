package com.om1cael.view;

import com.om1cael.controller.TaskController;
import com.om1cael.model.Task;
import com.om1cael.model.TaskPriority;
import com.om1cael.utils.InputParser;

public class TaskView {
    private final InputParser inputParser;
    private final TaskController taskController;

    public TaskView(InputParser inputParser, TaskController taskController) {
        this.inputParser = inputParser;
        this.taskController = taskController;
    }

    public void addTask() {
        int priorities = TaskPriority.values().length - 1;

        String description = inputParser.getText("Description: ", 4, 128);
        int priority = inputParser.getNumber("Priority (" + 0 + "-" + priorities +"): ", 0, priorities);

        Task task = new Task(0, description, TaskPriority.values()[priority]);
        this.taskController.addTask(task);
    }
}
