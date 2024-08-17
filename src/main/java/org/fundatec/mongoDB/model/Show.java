package org.fundatec.mongoDB.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "shows")
public class Show {

    @Id
    private String show_id;
    private String location;
    private String date;
    private int available_tickets;

    public Show(String show_id, String location, String date, int available_tickets) {
        this.show_id = show_id;
        this.location = location;
        this.date = date;
        this.available_tickets = available_tickets;
    }

    public String getShow_id() {
        return show_id;
    }

    public void setShow_id(String show_id) {
        this.show_id = show_id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getAvailable_tickets() {
        return available_tickets;
    }

    public void setAvailable_tickets(int available_tickets) {
        this.available_tickets = available_tickets;
    }
}
