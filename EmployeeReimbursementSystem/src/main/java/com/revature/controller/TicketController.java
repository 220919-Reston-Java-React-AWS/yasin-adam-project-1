package com.revature.controller;

import com.revature.model.Ticket;
import com.revature.repository.TicketTable;
import com.revature.service.TicketService;
import io.javalin.Javalin;

public class TicketController {

   private TicketService ticketService = new TicketService();

   public void mapEndPoints(Javalin app) {

   }

}
