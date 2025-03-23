package com.om1cael.utils;

import java.util.Scanner;

public class InputParser {
    private Scanner scanner;

    public InputParser(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getNumber(String message, int min, int max) throws NumberFormatException {
        int number = 0;
        System.out.print(message);

        while(true) {
            try {
                number = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("You did not input a number.");
            }
        }

        number = Math.clamp(number, min, max);
        return number;
    }

    public String getText(String message, int minSize, int maxSize) {
        System.out.print(message);
        String text;

        while(true) {
            text = scanner.nextLine();

            if(text.length() < minSize || text.length() > maxSize) {
                System.out.println("Your text should be within " + minSize + " and " + maxSize + " characters.");
            } else {
                break;
            }
        }

        return text;
    }
}
