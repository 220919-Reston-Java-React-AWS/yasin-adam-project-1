package com.revature;

import com.revature.controller.TicketController;
import com.revature.controller.UserController;
import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {

        Javalin app = Javalin.create();

        UserController uc = new UserController();
        TicketController tc = new TicketController();

        uc.mapEndPoints(app);
        tc.mapEndPoints(app);

        app.start(8080);
    }
}
