package com.om1cael;

import com.om1cael.utils.InputParser;
import com.om1cael.view.MenuView;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            InputParser inputParser = new InputParser(scanner);
            new MenuView(inputParser).showMenu();
        }
    }
}