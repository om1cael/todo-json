package com.om1cael.utils;

import java.util.Scanner;

public class InputParser {
    private Scanner scanner;

    public InputParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNumber(String message, int min, int max) throws NumberFormatException {
        System.out.print(message);
        int number = Integer.parseInt(scanner.nextLine());

        if(number < min) {
            number = min;
        }
        else if(number > max) {
            number = max;
        }

        return number;
    }

    public String getText(String message, int minSize, int maxSize) {
        System.out.print(message);
        String text = null;

        do {
            text = scanner.nextLine();
        } while (text.length() < minSize || text.length() > maxSize);

        return text;
    }
}
