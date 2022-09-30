package com.revature.model;

public class Ticket {

    private int id;
    private String category;
    private String description;
    private int userId;
    private int statusId;

    public Ticket() {
    }

    public Ticket(int id, String category, String description, int userId, int statusId)  {

        this.id = id;
        this.category = category;
        this.description = description;
        this.userId = userId;
        this.statusId = statusId;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }
}
