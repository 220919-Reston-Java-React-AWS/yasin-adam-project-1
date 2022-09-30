package com.revature.controller;

import com.revature.repository.UserTable;
import com.revature.service.UserService;
import io.javalin.Javalin;

import javax.servlet.http.HttpSession;

public class UserController {

   private UserService userService = new UserService();

    public void mapEndPoints(Javalin app) {

    }
}
