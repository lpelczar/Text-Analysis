package com.codecool.textanalysis.main;

import com.codecool.textanalysis.controllers.RootController;
import com.codecool.textanalysis.views.RootView;

public class Application {

    public static void main(String... args) {

        RootView rootView = new RootView();
        RootController rootController = new RootController(args, rootView);
        rootController.start();
    }
}
