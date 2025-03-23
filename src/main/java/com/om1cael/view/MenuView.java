package com.om1cael.view;

import com.om1cael.model.AppOptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuView {
    private final List<AppOptions> appOptions = new ArrayList<>();

    public void showMenu() {
        if(appOptions.isEmpty()) {
            populateOptions();
        }

        for(int i = 1; i <= appOptions.size(); i++) {
            System.out.println(i + ". " + appOptions.get(i - 1).getDescription());
        }
    }

    private void populateOptions() {
        this.appOptions.addAll(Arrays.asList(AppOptions.values()));
    }
}
