package com.om1cael.view;

import com.om1cael.model.AppOptions;
import com.om1cael.utils.InputParser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuView {
    private final InputParser inputParser;
    private final TaskView taskView;

    private final List<AppOptions> appOptions = new ArrayList<>();

    public MenuView(InputParser inputParser, TaskView taskView) {
        this.inputParser = inputParser;
        this.taskView = taskView;
    }

    public void showMenu() {
        if(appOptions.isEmpty()) {
            populateOptions();
        }

        for(int i = 0; i < appOptions.size(); i++) {
            int frontEndChoice = i + 1;
            System.out.println(frontEndChoice + ". " + appOptions.get(i).getDescription());
        }

        int choice = this.inputParser.getNumber("Your choice: ", 1, appOptions.size());
        handleChoice(appOptions.get(choice - 1));
    }

    private void handleChoice(AppOptions option) {
        switch (option) {
            case ADD_TASK -> this.taskView.addTask();
            case LIST_TASKS -> System.out.println("list tasks");
            case REMOVE_TASK -> System.out.println("remove task");
            case EXIT -> System.exit(0);
            default -> System.out.println("Invalid choice");
        }
    }

    private void populateOptions() {
        this.appOptions.addAll(Arrays.asList(AppOptions.values()));
    }
}
