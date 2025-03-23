package com.om1cael.utils;

import java.util.Scanner;

public class InputParser {
    private Scanner scanner;

    public InputParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNumber(int min, int max) throws NumberFormatException {
        int number = Integer.parseInt(scanner.nextLine());

        if(number < min) {
            number = min;
        }
        else if(number > max) {
            number = max;
        }

        return number;
    }

    public String getText(int minSize, int maxSize) {
        String text = null;

        do {
            text = scanner.nextLine();
        } while (text.length() < minSize || text.length() > maxSize);

        return text;
    }
}
