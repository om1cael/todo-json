package com.om1cael;

import com.google.gson.Gson;
import com.om1cael.controller.TaskController;
import com.om1cael.service.StorageService;
import com.om1cael.utils.InputParser;
import com.om1cael.view.MenuView;
import com.om1cael.view.TaskView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            InputParser inputParser = new InputParser(scanner);
            StorageService storageService = new StorageService(new Gson());

            TaskController taskController = new TaskController(storageService);
            TaskView taskView = new TaskView(inputParser, taskController);

            new MenuView(inputParser, taskView).showMenu();
        }
    }
}